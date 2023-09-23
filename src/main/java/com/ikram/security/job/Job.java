package com.ikram.security.job;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private String job_title;
    private String job_employer;
    private String job_publisher;
    private String job_location;
    private String job_employment_type;
    private String employer_logo;
    private String description;
    private String responsibilities;
    private List<String> qualifications;
}
