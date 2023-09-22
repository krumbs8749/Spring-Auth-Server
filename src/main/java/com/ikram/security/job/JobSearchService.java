package com.ikram.security.job;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobSearchService {

    public JobSearchResponse search (JobSearchRequest request){
        return JobSearchResponse.builder()
                .title(request.getQuery())
                .type("Full-time")
                .desc("Part-time")
                .location("Aachen")
                .salary(1000.50)
                .company("microsoft")
                .build();
    }
}
