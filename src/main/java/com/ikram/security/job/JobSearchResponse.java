package com.ikram.security.job;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobSearchResponse {
    @JsonProperty
    private String name;
    @JsonProperty
    private String company;
    @JsonProperty
    private double salary;
}
