package org.formation.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Employe extends Personne {

	private String login;
	private String motDePasse;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String nom, String prenom, String email, String telephone, String adresse, String ville,
			String codePostal, String login, String motDePasse) {
		super(nom, prenom, email, telephone, adresse, ville, codePostal);
		this.login = login;
		this.motDePasse = motDePasse;
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}
