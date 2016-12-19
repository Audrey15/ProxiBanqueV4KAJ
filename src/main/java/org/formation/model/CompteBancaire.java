package org.formation.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.web.context.annotation.ApplicationScope;

@Entity
@ApplicationScope
@ManagedBean
public class CompteBancaire {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long numCompte;
	
	private double solde;
	
	private TypeCompte typeCompte;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	public CompteBancaire() {
		super();
	}

	public CompteBancaire(Long numCompte, double solde, TypeCompte typeCompte) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.typeCompte = typeCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public TypeCompte getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}

	public Long getNumCompte() {
		return numCompte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
