package org.formation.model;

import java.util.HashSet;
import java.util.Set;

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

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Client extends Personne {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idClient;

	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name="conseiller_id")
	private Conseiller conseiller;
	
	@OneToMany(mappedBy="client", cascade = {CascadeType.PERSIST})
	private Set<CompteBancaire> listeComptes = new HashSet<>();
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, String email, String telephone, String adresse, String ville,
			String codePostal) {
		super(nom, prenom, email, telephone, adresse, ville, codePostal);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return idClient;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Set<CompteBancaire> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(Set<CompteBancaire> listeComptes) {
		this.listeComptes = listeComptes;
	}
	
	public void addCompte(CompteBancaire compte){
		listeComptes.add(compte);
		compte.setClient(this);
	}
	
}
