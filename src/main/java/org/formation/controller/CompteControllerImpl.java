package org.formation.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.model.TypeCompte;
import org.formation.service.IServiceCompte;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.ApplicationScope;

@Controller
@ManagedBean
@ApplicationScope
public class CompteControllerImpl implements ICompteController {

	@Resource
	IServiceCompte serviceCompte;

	private List<CompteBancaire> listeComptes = new ArrayList<>();
	private List<CompteBancaire> listeComptesByClient = new ArrayList<>();

	private CompteBancaire compteDebiteur;
	private CompteBancaire compteCrediteur;
	private Double montant = 0.0;

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	public CompteBancaire getCompteDebiteur() {
		return compteDebiteur;
	}

	public void setCompteDebiteur(CompteBancaire compteDebiteur) {
		this.compteDebiteur = compteDebiteur;
	}

	public CompteBancaire getCompteCrediteur() {
		return compteCrediteur;
	}

	public void setCompteCrediteur(CompteBancaire compteCrediteur) {
		this.compteCrediteur = compteCrediteur;
	}

	public List<CompteBancaire> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<CompteBancaire> listeComptes) {
		this.listeComptes = listeComptes;
	}

	public List<CompteBancaire> getListeComptesByClient() {
		return listeComptesByClient;
	}

	public void setListeComptesByClient(List<CompteBancaire> listeComptesByClient) {
		this.listeComptesByClient = listeComptesByClient;
	}

	@Override
	public String createCompteForClient(CompteBancaire compte, Client client) throws Exception {
		serviceCompte.createCompteForClient(compte, client);
		return "/views/client/listeclients";

	}

	@Override
	public String updateCompte(CompteBancaire compte) throws Exception {
		serviceCompte.updateCompte(compte);
		return "/views/compte/listecomptes";

	}

	@Override
	public String deleteCompteByNum(Long numCompte) throws Exception {
		serviceCompte.deleteCompteByNum(numCompte);
		return "/views/compte/listecomptes";
	}

	@Override
	public List<CompteBancaire> findAllComptes() throws Exception {
		listeComptes = serviceCompte.findAllCompte();
		return listeComptes;
	}

	@Override
	public List<CompteBancaire> findAllComptesByClient(Client client) throws Exception {
		listeComptesByClient = serviceCompte.findAllComptesByClient(client);
		return listeComptesByClient;
	}

	public void loadCompte(Long numCompte) throws Exception {
		CompteBancaire compte = serviceCompte.findCompteByNum(numCompte);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("comp", compte);
	}

	@Override
	public String virement(Long numCompte1, Long numCompte2, double montant) throws Exception {
		serviceCompte.virement(numCompte1, numCompte2, montant);
		return "/views/compte/listecomptes";
	}

	
	
}
