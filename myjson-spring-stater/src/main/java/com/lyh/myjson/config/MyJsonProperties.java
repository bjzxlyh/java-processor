package com.lyh.myjson.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "lyh.json")
public class MyJsonProperties {
    public static final String DEFAULT_NAME = "lyh";
    private String name = DEFAULT_NAME;
}
