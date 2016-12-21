package org.formation.model;

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@ManagedBean
@SessionScope
public class Conseiller extends Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCons;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="directeur_id")
	private DirecteurAgence directeur;

	@OneToMany(mappedBy="conseiller", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Client> listeClients = new HashSet<>();
	
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conseiller(String nom, String prenom, String email, String telephone, String adresse, String ville,
			String codePostal, String login, String motDePasse) {
		super(nom, prenom, email, telephone, adresse, ville, codePostal, login, motDePasse);
		// TODO Auto-generated constructor stub
	}

	public Long getIdCons() {
		return idCons;
	}

	public DirecteurAgence getDirecteur() {
		return directeur;
	}

	public void setDirecteur(DirecteurAgence directeur) {
		this.directeur = directeur;
	}

	public Set<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(Set<Client> listeClients) {
		this.listeClients = listeClients;
	}
	
	public void addClient(Client client){
		listeClients.add(client);
		client.setConseiller(this);
	}

}
