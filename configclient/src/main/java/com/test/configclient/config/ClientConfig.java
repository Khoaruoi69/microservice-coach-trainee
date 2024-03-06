package com.test.configclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sample")
public class ClientConfig {
    private String properties1;

    public String getProperties1() {
        return properties1;
    }

    public void setProperties1(String properties1) {
        this.properties1 = properties1;
    }
}
