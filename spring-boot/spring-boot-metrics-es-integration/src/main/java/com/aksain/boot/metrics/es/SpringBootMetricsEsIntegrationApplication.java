package com.aksain.boot.metrics.es;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
public class SpringBootMetricsEsIntegrationApplication {
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	
	@Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
		return registry -> registry.config().commonTags("application.name", applicationName);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMetricsEsIntegrationApplication.class, args);
	}

}

