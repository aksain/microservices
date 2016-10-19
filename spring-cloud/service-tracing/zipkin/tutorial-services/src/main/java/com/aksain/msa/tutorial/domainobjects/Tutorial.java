package com.aksain.msa.tutorial.domainobjects;

public class Tutorial {
	private Long id;
	private String name;
	private String description;
	private Long authorId;
	private String authorName;

	public Tutorial() {
	}

	public Tutorial(Long id, String name, String description, Long authorId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.authorId = authorId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
