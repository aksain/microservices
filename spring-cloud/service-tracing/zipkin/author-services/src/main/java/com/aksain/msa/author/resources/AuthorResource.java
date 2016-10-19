package com.aksain.msa.author.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.aksain.msa.author.domainobjects.Author;

/**
 * REST Resource containing methods for performing operations on Author.
 * 
 * @author Amit Kumar
 */
@Path("/author")
public class AuthorResource {

	@Path("/{authorId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAuthor(@PathParam("authorId") Long authorId) {
		final Author author = (authorId == 1 ? new Author(authorId, "Amit Kumar")
				: new Author(authorId, "Sain Technology Solutions"));

		return Response.ok(author).build();
	}
}
