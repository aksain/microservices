package com.aksain.msa.tutorial.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.aksain.msa.tutorial.domainobjects.Tutorial;
import com.aksain.msa.tutorial.services.TutorialService;

/**
 * REST Resource containing methods for performing operations on Tutorial.
 * 
 * @author Amit Kumar
 */
@Path("/tutorial")
public class TutorialResource {
	
	@Inject
	private TutorialService tutorialService;
	
	@Path("/{tutorialId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTutorial(@PathParam("tutorialId") Long tutorialId) {
		final Tutorial tutorial = tutorialService.getById(tutorialId);
		
		return Response.ok(tutorial).build();
	}
}
