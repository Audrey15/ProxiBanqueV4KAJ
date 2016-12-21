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
import javax.persistence.OneToMany;

/**
 * @author KAJ
 * Classe modèle DirecteurAgence, étend la classe Employe
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class DirecteurAgence extends Employe {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idDir;

	@OneToMany(mappedBy="directeur", cascade = {CascadeType.PERSIST})
	private Set<Conseiller> listeConseillers = new HashSet<>();
	
	public DirecteurAgence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DirecteurAgence(String nom, String prenom, String email, String telephone, String adresse, String ville,
			String codePostal, String login, String motDePasse) {
		super(nom, prenom, email, telephone, adresse, ville, codePostal, login, motDePasse);
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return idDir;
	}

	public Set<Conseiller> getListeConseillers() {
		return listeConseillers;
	}

	public void setListeConseillers(Set<Conseiller> listeConseillers) {
		this.listeConseillers = listeConseillers;
	}
	
	public void ajouterConseiller(Conseiller conseiller){
		listeConseillers.add(conseiller);
		conseiller.setDirecteur(this);
	}
	
}
