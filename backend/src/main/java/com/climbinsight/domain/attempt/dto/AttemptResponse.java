package com.climbinsight.domain.attempt.dto;

import com.climbinsight.domain.attempt.entity.ClimbingAttempt;
import java.time.LocalDateTime;

public record AttemptResponse(
        Long id,
        String climberName,
        String routeName,
        String failurePhase,
        String suspectedCause,
        LocalDateTime attemptedAt
) {
    public static AttemptResponse from(ClimbingAttempt attempt) {
        return new AttemptResponse(
                attempt.getId(),
                attempt.getClimberName(),
                attempt.getRouteName(),
                attempt.getFailurePhase(),
                attempt.getSuspectedCause(),
                attempt.getAttemptedAt()
        );
    }
}
