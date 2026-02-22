package com.climbinsight.domain.attempt.controller;

import com.climbinsight.domain.attempt.dto.AttemptResponse;
import com.climbinsight.domain.attempt.dto.CreateAttemptRequest;
import com.climbinsight.domain.attempt.service.ClimbingAttemptService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/attempts")
public class ClimbingAttemptController {

    private final ClimbingAttemptService climbingAttemptService;

    public ClimbingAttemptController(ClimbingAttemptService climbingAttemptService) {
        this.climbingAttemptService = climbingAttemptService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AttemptResponse create(@Valid @RequestBody CreateAttemptRequest request) {
        return climbingAttemptService.create(request);
    }

    @GetMapping
    public List<AttemptResponse> findAll() {
        return climbingAttemptService.findAll();
    }

    @GetMapping("/{attemptId}/analysis")
    public String analyze(@PathVariable Long attemptId) {
        return climbingAttemptService.analyze(attemptId);
    }
}
