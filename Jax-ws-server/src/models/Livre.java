package models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "livre")
@XmlAccessorType(XmlAccessType.FIELD)
public class Livre {

	@XmlAttribute
	private String id;
	@XmlElement
	private String titre;
	@XmlElement
	private double prix;
	@XmlElement(name = "auteur")
	private List<Auteur> auteurs; 
	
	public Livre() {
		super();
	}

	public Livre(String id, String titre, double prix) {
		super();
		this.id = id;
		this.titre = titre;
		this.prix = prix;
	}
	

	public Livre(String id, String titre, double prix, List<Auteur> auteurs) {
		super();
		this.id = id;
		this.titre = titre;
		this.prix = prix;
		this.auteurs = auteurs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	

	public List<Auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}

	
	
	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", prix=" + prix + ", auteurs=" + auteurs + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public void addAuteur(Auteur auteur) {
		auteurs.add(auteur);
	}
	
	
	
}
