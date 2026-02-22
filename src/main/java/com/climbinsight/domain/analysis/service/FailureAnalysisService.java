package com.climbinsight.domain.analysis.service;

import com.climbinsight.domain.attempt.entity.ClimbingAttempt;
import org.springframework.stereotype.Service;

@Service
public class FailureAnalysisService {

    public String summarizeFailure(ClimbingAttempt attempt) {
        return "[" + attempt.getFailurePhase() + "] 구간에서 " + attempt.getSuspectedCause() + " 가능성이 높습니다.";
    }
}
