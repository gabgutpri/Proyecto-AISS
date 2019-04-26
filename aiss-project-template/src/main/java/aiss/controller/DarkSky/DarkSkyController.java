package aiss.controller.DarkSky;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.darkSky.Datum;
import aiss.model.resource.DarkSkyResource;


/**
 * Servlet implementation class SearchController
 */
public class DarkSkyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(DarkSkyController.class.getName());
	 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	// Las llamadas solo pueden ser GET
		
		String coordenates = request.getParameter("coordenates");
		String date = request.getParameter("date");
		
		log.log(Level.FINE, "Searching for forecast in "+coordenates +" in date "+date);
		DarkSkyResource dK = new DarkSkyResource();
		Datum dKResult = dK.getLatAltDayForecast(coordenates, date);

		
		if (dKResult!=null){
			request.setAttribute("forecast", dKResult.getSummary());
			request.setAttribute("icon", dKResult.getIcon());
		} else {
			log.log(Level.SEVERE, "OMDb object: " + dKResult);
		}
		request.getRequestDispatcher("").forward(request, response);
	}
		
}
