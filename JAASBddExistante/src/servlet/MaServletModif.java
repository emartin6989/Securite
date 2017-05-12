package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Client;
import service.ClientService;
import service.IClientService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServletModif")
public class MaServletModif extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServletModif() {
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
		
		// 1 récupérer les param utilisateurs
		// je récupere les données saisies dans des variables
		String id = request.getParameter("id");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String couleuryeux = request.getParameter("couleuryeux");
		String age = request.getParameter("age");
		String password = request.getParameter("password");
		
		
		int Id; 
		Id = Integer.parseInt(id);
		
		int Age; 
		Age = Integer.parseInt(age);
		
		// 2 faire les traitements avec la couche service
		Client c = new Client();
		IClientService s = new ClientService();
		s.modifierClient(Id, nom, prenom, couleuryeux, Age, password);
		
		// 3 préparer l'envoi des elts à la JSP
		// à gauche c'est le nom de l'attribut qu'on donnera dans la JSP. A
		// droite c'est le nom de la variable concernée dans la servlet
		request.setAttribute("lid", c.getId());
		request.setAttribute("lenom", c.getNom());
		request.setAttribute("leprenom", c.getPrenom());
		request.setAttribute("laCouleurYeux", c.getCouleuryeux());
		request.setAttribute("lage", c.getAge());
		request.setAttribute("lepassword", c.getPassword());
		
		// 4 envoi des elts à la JSP
		//on indique le nom de la jsp concernée
		request.getRequestDispatcher("/resultat.jsp").forward(request, response);
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
