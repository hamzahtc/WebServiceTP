package webservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import models.Auteur;
import models.Livre;

@WebService(serviceName = "LivreWS")
public class LivreService {

	List<Livre> livres;

	public LivreService() {
		livres = new ArrayList<Livre>();
		Livre livre1 = new Livre("livre1", "Antigone", 1500,
				Arrays.asList(new Auteur("Chekrouni", "Amine"), new Auteur("Elfassi", "Hamza")));
		Livre livre2 = new Livre("livre2", "La boite à merveilles", 1800,
				Arrays.asList(new Auteur("Benkiran", "Adil"), new Auteur("Khemisse", "Ihssan")));
		Livre livre3 = new Livre("livre3", "Disney land", 2500,
				Arrays.asList(new Auteur("Taouil", "Moad"), new Auteur("Kabir", "Anass")));
		livres.add(livre1);
		livres.add(livre2);
		livres.add(livre3);
		System.out.println(livres);
	}

	private Livre get(String id) {
		for (Livre livre : livres) {
			if (livre.getId().equals(id))
				return livre;
		}
		return null;
	}

	@WebMethod(operationName = "getLivres")
	public List<Livre> getLivres() {
		return livres;
	}

	@WebMethod(operationName = "addLivre")
	public void addLivre(@WebParam(name = "livre") Livre livre) {
		livres.add(livre);
	}

	@WebMethod(operationName = "deleteLivre")
	public void deleteLivre(@WebParam(name = "id") String id) {
		livres.remove(this.get(id));
	}

	@WebMethod(operationName = "updateLivre")
	public void updateLivre(@WebParam(name = "livre") Livre livre) {
		if (livres.contains(livre)) {
			livres.set(livres.indexOf(livre), livre);
		} else {
			System.out.println("Error");
		}
	}

	@WebMethod(operationName = "getLivre")
	public Livre getLivre(@WebParam(name = "id") String id, @WebParam(name = "titre") String titre,
			@WebParam(name = "auteur") String auteur) {
		System.out.println("id : " + id);
		System.out.println("titre : " + titre);
		System.out.println("auteur : " + auteur);

		if (id != null) {
			for (Livre livre : livres) {
				if (id.equals(livre.getId()))
					return livre;
			}
		}

		else if (titre != null) {
			for (Livre livre : livres) {
				if (titre.equals(livre.getTitre()))
					return livre;
			}
		}

		else if (auteur != null) {
			for (Livre livre : livres) {
				for (Auteur auteurl : livre.getAuteurs()) {
					if (auteur.equals(auteurl.getNom()))
						return livre;
				}
			}
		}
		return null;
	}

}
