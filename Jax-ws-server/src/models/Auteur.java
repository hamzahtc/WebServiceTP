package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "auteur")
@XmlAccessorType (XmlAccessType.FIELD)
public class Auteur {

	@XmlElement
	private String nom;
	@XmlElement
	private String prenom;
	
	public Auteur() {
		super();
	}


	public Auteur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Auteur [nom=" + nom + ", prenom=" + prenom + "]";
	}


	
}
