package org.formation.controller;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;

public interface ICompteController {
	
	public String createCompteForClient(CompteBancaire compte, Client client) throws Exception;
	
	public String updateCompte(CompteBancaire compte)throws Exception;
	
	public String deleteCompteByNum(Long numCompte)throws Exception;
	
	public List<CompteBancaire> findAllComptes()throws Exception;
	
	public List<CompteBancaire> findAllComptesByClient(Client client)throws Exception;
	
	public String virement(Long numCompte1, Long numCompte2, double montant)throws Exception;

}
