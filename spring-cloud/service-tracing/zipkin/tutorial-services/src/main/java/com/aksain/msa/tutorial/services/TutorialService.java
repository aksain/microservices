/**
 * 
 */
package com.aksain.msa.tutorial.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aksain.msa.tutorial.domainobjects.Author;
import com.aksain.msa.tutorial.domainobjects.Tutorial;

/**
 * Provides method to manage tutorials.
 * 
 * @author Amit Kumar
 */
@Service
public class TutorialService {
	private final List<Tutorial> tutorials = new ArrayList<>();
	
	@Value("${service.author.baseURI}")
	private String authorBaseURI;
	
	@Inject
	private RestTemplate restTemplate;

	@PostConstruct
	public void init() {
		tutorials.add(new Tutorial(1l, "Tutorial1", "Tutorial 1 Description", 1l));
		tutorials.add(new Tutorial(2l, "Tutorial2", "Tutorial 2 Description", 1l));
		tutorials.add(new Tutorial(3l, "Tutorial3", "Tutorial 3 Description", 2l));
		tutorials.add(new Tutorial(4l, "Tutorial4", "Tutorial 4 Description", 2l));
	}

	public Tutorial getById(Long tutorialId) {
		
		final Tutorial tutorial = tutorials.stream().filter((tmpTutorial) -> tmpTutorial.getId() == tutorialId).findFirst()
				.get();

		final Author author = restTemplate.getForObject(URI.create(authorBaseURI + tutorial.getAuthorId()), Author.class);
		tutorial.setAuthorName(author.getName());
		
		return tutorial;
	}
}
