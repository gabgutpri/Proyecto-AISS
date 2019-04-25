package aiss;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	private static final Logger log = Logger.getLogger(HelloWorldServlet.class.getName());
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		// Sample log
		log.log(Level.FINE, "Processing GET request");
		 
		resp.setContentType("text/plain");
		resp.getWriter().println("Planeando");
		resp.getWriter().println("");
		resp.getWriter().println("Miembros:");
		resp.getWriter().println("-Gabriel Gutierrez Prieto");
		resp.getWriter().println("-Martín Arturo Guerrero Romero");
		resp.getWriter().println("-Thibaut Lopez");
		resp.getWriter().println("-Abraham García Villalobos");
		resp.getWriter().println("");
		resp.getWriter().println("Descripción: ");
		resp.getWriter().println("Nuestro grupo, tras el nombre Planeando,"
				+ " ofrece consultas sobre eventos de diferentes tipos,"
				+ " así como la posibilidad de organizarse para dichos eventos,"
				+ " compartir tu planificación con otras personas, ver la zona de estos eventos,"
				+ " comentarios sobre estos mismos, etc.");
	}
}
