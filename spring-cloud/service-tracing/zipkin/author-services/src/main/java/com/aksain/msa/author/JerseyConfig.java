package com.aksain.msa.author;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		this.packages("com.aksain.msa.author.resources");
	}
}
