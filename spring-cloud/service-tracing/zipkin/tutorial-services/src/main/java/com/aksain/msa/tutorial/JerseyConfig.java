package com.aksain.msa.tutorial;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		this.packages("com.aksain.msa.tutorial.resources");
	}
}
