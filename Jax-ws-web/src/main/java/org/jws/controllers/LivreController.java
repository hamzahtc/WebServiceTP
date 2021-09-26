package org.jws.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservices.Livre;
import webservices.LivreService;
import webservices.LivreWS;

@WebServlet("/LivreController")
public class LivreController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	LivreService service;
	List<Livre> livres;
	Livre livre;

	@Override
	public void init() throws ServletException {
		service = new LivreWS().getLivreServicePort();
		livres = service.getLivres();
		if (livres == null)
			livres = new ArrayList<Livre>();
		System.out.println(livres.get(0).getTitre());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (livre != null) {
			List<Livre> l = new ArrayList<>();
			l.add(livre);
			request.setAttribute("livres", l);
		} else {
			request.setAttribute("livres", livres);
		}
		request.getRequestDispatcher("livres.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		String value = request.getParameter("value");
		if (value != null) {
			switch (type) {
			case "id":
				livre = service.getLivre(value, null, null);
				break;
			case "titre":
				livre = service.getLivre(null, value, null);
				break;
			case "auteur":
				livre = service.getLivre(null, null, value);
				break;
			default:
				break;
			}
		}

		doGet(request, response);
	}

}
