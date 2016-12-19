package org.formation.model;

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.FetchProfile;
import org.springframework.web.context.annotation.ApplicationScope;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@ManagedBean
@ApplicationScope
public class Client extends Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;

	@OneToMany(mappedBy = "client", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch=FetchType.EAGER)
	private Set<CompteBancaire> listeComptes = new HashSet<>();

	public Client() {
		super();
	}

	public Client(String nom, String prenom, String email, String telephone, String adresse, String ville,
			String codePostal) {
		super(nom, prenom, email, telephone, adresse, ville, codePostal);
	}

	public Long getIdClient() {
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

	public void addCompte(CompteBancaire compte) {
		listeComptes.add(compte);
		compte.setClient(this);
	}

}
