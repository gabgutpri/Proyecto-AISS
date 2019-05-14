package aiss.model.repository;

import java.util.Collection;

import aiss.model.Commentary;

public interface CommentaryListRepository {
	
	// Commentaries
	public void addCommentary(Commentary s);
	public Collection<Commentary> getAllCommentaries();
	public Commentary getCommentary(String commentaryId);
	public void updateCommentary(Commentary s);
	public void deleteCommentary(String commentaryId);

}
