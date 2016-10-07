package com.aksain.microservices.springboot.basics.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.aksain.microservices.springboot.basics.models.Tutorial;
import com.aksain.microservices.springboot.basics.services.TutorialService;

/**
 * @author amit-kumar
 *
 */
@Component
@Path("/tutorials")
public class TutorialResource {
	
	@Inject
	private TutorialService tutorialService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById() {
		final List<Tutorial> tutorials = tutorialService.getAllTutorials();
		
		return Response.ok(tutorials).build();
	}

	@Path("/{tutorialId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(@PathParam("tutorialId") final Long tutorialId) {
		final Tutorial tutorial = tutorialService.getById(tutorialId);
		
		return Response.ok(tutorial).build();
	}
}
