package com.test.configclient.controller;

import com.test.configclient.config.ClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
public class ConfigClientController {
    @Autowired
    private ClientConfig clientConfig;

    @Value("${sample.properties2}")
    private String property2;
    @RequestMapping("/config")
    public String printConfig() {
        return clientConfig.getProperties1() + "------" + property2;
    }
}
