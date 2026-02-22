package com.climbinsight.domain.attempt.service;

import com.climbinsight.common.error.BusinessException;
import com.climbinsight.common.error.ErrorCode;
import com.climbinsight.domain.analysis.service.FailureAnalysisService;
import com.climbinsight.domain.attempt.dto.AttemptResponse;
import com.climbinsight.domain.attempt.dto.CreateAttemptRequest;
import com.climbinsight.domain.attempt.entity.ClimbingAttempt;
import com.climbinsight.domain.attempt.repository.ClimbingAttemptRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ClimbingAttemptService {

    private final ClimbingAttemptRepository climbingAttemptRepository;
    private final FailureAnalysisService failureAnalysisService;

    public ClimbingAttemptService(ClimbingAttemptRepository climbingAttemptRepository, FailureAnalysisService failureAnalysisService) {
        this.climbingAttemptRepository = climbingAttemptRepository;
        this.failureAnalysisService = failureAnalysisService;
    }

    @Transactional
    public AttemptResponse create(CreateAttemptRequest request) {
        ClimbingAttempt attempt = new ClimbingAttempt(
                request.climberName(),
                request.routeName(),
                request.failurePhase(),
                request.suspectedCause(),
                request.attemptedAt() == null ? LocalDateTime.now() : request.attemptedAt()
        );
        return AttemptResponse.from(climbingAttemptRepository.save(attempt));
    }

    public List<AttemptResponse> findAll() {
        return climbingAttemptRepository.findAll().stream()
                .map(AttemptResponse::from)
                .toList();
    }

    public String analyze(Long attemptId) {
        ClimbingAttempt attempt = climbingAttemptRepository.findById(attemptId)
                .orElseThrow(() -> new BusinessException(ErrorCode.ATTEMPT_NOT_FOUND));
        return failureAnalysisService.summarizeFailure(attempt);
    }
}
