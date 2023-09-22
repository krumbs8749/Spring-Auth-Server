package com.ikram.security.job;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/job")
@RequiredArgsConstructor
public class JobSearchController {
    private final JobSearchService service;

    @GetMapping("/search")
    public ResponseEntity<JobSearchResponse> searchJob (@RequestBody JobSearchRequest request){
        return ResponseEntity.ok(service.search(request));
    }
}