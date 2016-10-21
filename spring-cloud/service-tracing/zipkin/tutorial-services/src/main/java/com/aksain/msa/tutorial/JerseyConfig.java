package com.aksain.msa.tutorial;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.aksain.msa.tutorial.resources.TutorialResource;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		this.register(TutorialResource.class);
	}
}
