package com.ikram.security.job;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class JobSearchService {
    private final DemoJobs demoJob = DemoJobs.getInstance();
    public JobSearchResponse search (JobSearchRequest request){
        return JobSearchResponse.builder()
                .jobs(demoJob.getDemoJobs())
                .build();
    }
}
