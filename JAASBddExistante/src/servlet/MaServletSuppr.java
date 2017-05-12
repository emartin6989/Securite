package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ClientService;
import service.IClientService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServletSuppr")
public class MaServletSuppr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServletSuppr() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		// 1 r�cup�rer les param utilisateurs
		// je r�cupere les donn�es saisies dans des variables
		String id = request.getParameter("id");
	
		int Id; 
		Id = Integer.parseInt(id);
		
		// 2 faire les traitements avec la couche service
		
		IClientService s = new ClientService();
		s.supprimerClient(Id);
		
		// 3 pr�parer l'envoi des elts � la JSP
		// � gauche c'est le nom de l'attribut qu'on donnera dans la JSP. A
		// droite c'est le nom de la variable concern�e dans la servlet
		request.setAttribute("lid", id);
		
		// 4 envoi des elts � la JSP
		//on indique le nom de la jsp concern�e
		request.getRequestDispatcher("/supprimer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
