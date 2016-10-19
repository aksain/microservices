package com.aksain.msa.tutorial.domainobjects;

/**
 * Domain Object to model an Author.
 * 
 * @author Amit Kumar
 */
public class Author {
	private Long id;
	private String name;
	public Author() {
	}
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
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
