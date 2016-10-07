package com.aksain.microservices.springboot.basics.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aksain.microservices.springboot.basics.models.Tutorial;
import com.aksain.microservices.springboot.basics.services.TutorialService;

/**
 * @author amit-kumar
 *
 */
@RestController
@RequestMapping("/tutorials")
public class TutorialResource {

	@Autowired
	private TutorialService tutorialService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tutorial> getById() {
		return tutorialService.getAllTutorials();
	}

	@RequestMapping(value = "/{tutorialId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Tutorial getById(@PathVariable("tutorialId") final Long tutorialId) {

		return tutorialService.getById(tutorialId);
	}
}
