package com.polarbookshop.catalogService.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "polar")
public class PolarProperties {
    private String greeting;

    public String getGreeting() {
        return this.greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
