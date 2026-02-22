package com.climbinsight.domain.attempt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ClimbingAttempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String climberName;
    private String routeName;
    private String failurePhase;
    private String suspectedCause;
    private LocalDateTime attemptedAt;

    protected ClimbingAttempt() {
    }

    public ClimbingAttempt(String climberName, String routeName, String failurePhase, String suspectedCause, LocalDateTime attemptedAt) {
        this.climberName = climberName;
        this.routeName = routeName;
        this.failurePhase = failurePhase;
        this.suspectedCause = suspectedCause;
        this.attemptedAt = attemptedAt;
    }

    public Long getId() {
        return id;
    }

    public String getClimberName() {
        return climberName;
    }

    public String getRouteName() {
        return routeName;
    }

    public String getFailurePhase() {
        return failurePhase;
    }

    public String getSuspectedCause() {
        return suspectedCause;
    }

    public LocalDateTime getAttemptedAt() {
        return attemptedAt;
    }
}
