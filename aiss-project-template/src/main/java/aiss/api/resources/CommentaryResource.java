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

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;

import aiss.model.Commentary;
import aiss.model.repository.CommentaryListRepository;
import aiss.model.repository.MapCommentaryListRepository;

import java.net.URI;
import java.util.Collection;


@Path("/comentaries")
public class CommentaryResource {

	public static CommentaryResource _instance=null;
	CommentaryListRepository repository;
	
	private CommentaryResource(){
		repository=MapCommentaryListRepository.getInstance();
	}
	
	public static CommentaryResource getInstance() {
		if(_instance==null)
			_instance=new CommentaryResource();
		return _instance; 
	}
	
	@GET
	@Produces("application/json")
	public Collection<Commentary> getAll() {
		return repository.getAllCommentaries();
	}
	
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Commentary getCommentary(@PathParam("id") String commentaryId)
	{
		Commentary list = repository.getCommentary(commentaryId);
		
		if(list == null) {
			throw new NotFoundException("The commentary with id = " + commentaryId + "was not found");
		}
		
		return list;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addCommentary(@Context UriInfo uriInfo, Commentary comment) {
		if(comment.getTitle() == null || "".equals(comment.getTitle())) {
			throw new BadRequestException("The title of the commentary must not be null");
		}
		if(comment.getBody() == null) {
			throw new BadRequestException("The body property can not be null");
		}
		
		repository.addCommentary(comment);
		
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(comment.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(comment);
		return resp.build();
	}
	
	
	@PUT
	@Consumes("application/json")
	@Path("/{id}")
	public Response updateCommentary(Commentary comment) {
		Commentary oldComment = repository.getCommentary(comment.getId());
		if(oldComment == null) {
			throw new NotFoundException("The commentary with id = " + oldComment + "was not found");
		}
		if(comment.getBody() == null) {
			throw new BadRequestException("The body property can not be null");
		}
		
		if(!oldComment.getBody().equals(comment.getBody())) {
			return Response.status(javax.ws.rs.core.Response.Status.CONFLICT).build();
		}
		
		//Update title
		if(comment.getTitle()!=null) {
			oldComment.setTitle(comment.getTitle());
		}
		
		//Update body
		if(comment.getBody()!=null) {
			oldComment.setBody(comment.getBody());
		}
		
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeCommentary(@PathParam("id") String commentaryId) {
		
		Commentary toberemoved = repository.getCommentary(commentaryId);
		
		if(toberemoved == null) {
			throw new NotFoundException("The commentary with id = " + commentaryId + "was not found");
		} else {
			repository.deleteCommentary(commentaryId);
		}
		return Response.noContent().build();
	}
	
}
