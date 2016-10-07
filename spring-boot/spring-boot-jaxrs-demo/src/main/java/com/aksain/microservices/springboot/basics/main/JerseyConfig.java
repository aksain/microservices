package com.aksain.microservices.springboot.basics.main;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.aksain.microservices.springboot.basics.resources.TutorialResource;

/**
 * @author amit-kumar
 *
 */
@Component
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		register(TutorialResource.class);
		packages("com.aksain.microservices.springboot.basics.resources");
	}
}
