package aiss.api.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;

import aiss.model.Commentary;
import aiss.model.repository.CommentaryListRepository;
import aiss.model.repository.MapCommentaryListRepository;

import java.util.Collection;


@Path("/comentarios")
public class CommentaryResource {

	public static CommentaryResource _instance=null;
	CommentaryListRepository repository;
	
	private CommentaryResource(){
		repository=MapCommentaryListRepository.getInstance();
	}
	
	public static CommentaryResource getInstance()
	{
		if(_instance==null)
			_instance=new CommentaryResource();
		return _instance; 
	}
	
	@GET
	@Produces("application/json")
	public Collection<Commentary> getAll()
	{
		return null;
	}
	
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Commentary get(@PathParam("id") String commentaryId)
	{
		
		return null;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addCommentary(@Context UriInfo uriInfo, Commentary comment) {
		return null;
	}
	
	
	@PUT
	@Consumes("application/json")
	@Path("/{id}")
	public Response updateCommentary(@PathParam("id") Commentary comment) {
		return null;
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeCommentary(@PathParam("id") String commentaryId) {
		return null;
	}
	
}
