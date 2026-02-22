package com.climbinsight.domain.attempt.repository;

import com.climbinsight.domain.attempt.entity.ClimbingAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClimbingAttemptRepository extends JpaRepository<ClimbingAttempt, Long> {
}
