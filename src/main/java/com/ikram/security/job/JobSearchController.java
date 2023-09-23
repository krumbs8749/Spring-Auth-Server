package com.ikram.security.job;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/job")
@RequiredArgsConstructor
@CrossOrigin
public class JobSearchController {
    private final JobSearchService service;
    @PostMapping("/search")
    public ResponseEntity<JobSearchResponse> searchJob (@RequestBody JobSearchRequest request){
        System.out.println(request.getQuery());

        return ResponseEntity.ok(service.search(request));
    }
}
