package com.aksain.msa.author;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.aksain.msa.author.resources.AuthorResource;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		this.register(AuthorResource.class);
	}
}
