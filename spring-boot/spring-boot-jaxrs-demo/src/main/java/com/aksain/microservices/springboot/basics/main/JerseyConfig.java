package com.aksain.microservices.springboot.basics.main;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * @author Amit Kumar
 */
@Component
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		packages("com.aksain.microservices.springboot.basics.resources");
	}
}
