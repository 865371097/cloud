package com.guq.cloud.customer.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfig {

    @Bean
    public IRule ribbonRule() {
        return new com.netflix.loadbalancer.RandomRule();
    }

    @Bean
    public IRule rule() {
        return new BestAvailableRule();
    }
}
