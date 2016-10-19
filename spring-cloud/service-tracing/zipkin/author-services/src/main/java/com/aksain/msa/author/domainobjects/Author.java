package com.aksain.msa.author.domainobjects;

/**
 * Domain Object to model an Author.
 * 
 * @author Amit Kumar
 */
public class Author {
	private final Long id;
	private final String name;
	public Author(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
