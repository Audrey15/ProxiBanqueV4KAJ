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
import org.formation.service.IServiceCompte;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.ApplicationScope;

@Controller
@ManagedBean
@ApplicationScope
public class CompteControllerImpl implements ICompteController{

	@Resource
	IServiceCompte serviceCompte;
	
	private List<CompteBancaire> listeComptes = new ArrayList<>();
	private List<CompteBancaire> listeComptesByClient = new ArrayList<>();

	private CompteBancaire compte;

	public CompteBancaire getCompte() {
		return compte;
	}

	public void setCompte(CompteBancaire compte) {
		this.compte = compte;
	}

	@Override
	public String createCompteForClient(CompteBancaire compte, Client client) throws Exception {
		serviceCompte.createCompteForClient(compte, client);
		return "listecomptes";
	}

	@Override
	public String updateCompte(CompteBancaire compte) throws Exception {
		serviceCompte.updateCompte(compte);
		return "listecomptes";
	}

	@Override
	public String deleteCompteByNum(Long numCompte) throws Exception {
		serviceCompte.deleteCompteByNum(numCompte);
		return "listecomptes";
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
	
	public void loadCompte(Long numCompte) throws Exception{
		CompteBancaire compte = serviceCompte.findCompteByNum(numCompte);
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("comp", compte);
	}

	@Override
	public String virement(CompteBancaire compte1, CompteBancaire compte2, double montant) throws Exception {
		serviceCompte.virement(compte1, compte2, montant);
		return "listecomptes";
	}
	
}
