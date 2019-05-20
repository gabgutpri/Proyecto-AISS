package aiss.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import aiss.model.Commentary;


public class MapCommentaryListRepository implements CommentaryListRepository{

	Map<String, Commentary> commentaryMap;
	private static MapCommentaryListRepository instance=null;
	private int index=0;			// Index to create commentaries' identifiers.
	
	
	public static MapCommentaryListRepository getInstance() {
		if (instance==null) {
			instance = new MapCommentaryListRepository();
			instance.init();
		}
		return instance;
	}
	
	public void init() {
		
		commentaryMap = new HashMap<String,Commentary>();
		
		// Create commentaries
		Commentary comment1 = new Commentary();
		comment1.setTitle("Beach events");
		comment1.setBody("La fiesta fue maravillosa. Grandes vistas y buena gente. ¡Muy recomendable!");
		addCommentary(comment1);
		
		Commentary comment2 = new Commentary();
		comment2.setTitle("Party night");
		comment2.setBody("I good party. Nice!");
		addCommentary(comment2);
		
		Commentary comment3 = new Commentary();
		comment3.setTitle("Losing my Religion");
		comment3.setBody("Buena fiesta en un claustro eclesiastico abandonado. Gran decoracion");
		addCommentary(comment3);
		
		Commentary comment4 = new Commentary();
		comment4.setTitle("Fiesta privada");
		comment4.setBody("Dejo bastante que desear. Falto bebida y fue un poco aburrida.");
		addCommentary(comment4);
		
		Commentary comment5 = new Commentary();
		comment5.setTitle("Abraham Birthday");
		comment5.setBody("Estuvo bien pero no repitiria");
		addCommentary(comment5);
	}

	// Song related operations
	public void addCommentary(Commentary s) {
		String id = "planeando" + index++;
		s.setId(id);
		commentaryMap.put(id, s);
	}
	
	public Collection<Commentary> getAllCommentaries() {
			return commentaryMap.values();
	}

	public Commentary getCommentary(String commentaryId) {
		return commentaryMap.get(commentaryId);
	}

	public void updateCommentary(Commentary s) {
		Commentary comment = commentaryMap.get(s.getId());
		comment.setTitle(s.getTitle());
		comment.setBody(s.getBody());
	}

	public void deleteCommentary(String commentId) {
		commentaryMap.remove(commentId);
	}
	
}
