package com.climbinsight.domain.attempt.dto;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public record CreateAttemptRequest(
        @NotBlank String climberName,
        @NotBlank String routeName,
        @NotBlank String failurePhase,
        @NotBlank String suspectedCause,
        LocalDateTime attemptedAt
) {
}
