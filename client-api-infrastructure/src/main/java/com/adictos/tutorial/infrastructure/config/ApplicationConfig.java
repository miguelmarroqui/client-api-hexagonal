package com.adictos.tutorial.infrastructure.config;

import jakarta.inject.Singleton;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.adictos.tutorial.application",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Singleton.class)
)
public class ApplicationConfig {}
