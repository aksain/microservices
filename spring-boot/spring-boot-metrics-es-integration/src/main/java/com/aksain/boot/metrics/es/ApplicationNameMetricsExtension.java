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
	
	@Value("${server.port:8080}")
	private String serverPort;
	
	@Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() throws UnknownHostException {
		final String hostName = InetAddress.getLocalHost().getHostName();
		return registry -> registry.config()
				// Add service name, host and port to global tags
				.commonTags(
						"service.name", applicationName, 
						"service.host", hostName,
						"service.port", serverPort
					);
	}
}
