package com.aksain.boot.metrics.es;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class ApplicationNameMetricsExtension {
	@Value("${spring.application.name}")
	private String applicationName;
	
	@Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() throws UnknownHostException {
		final String hostName = InetAddress.getLocalHost().getHostName();
		return registry -> registry.config()
				.commonTags(
						"service.name", applicationName, 
						"service.host", hostName
					);
	}
}
