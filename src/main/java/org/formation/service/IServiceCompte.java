package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.model.Conseiller;

public interface IServiceCompte {

	public void createCompte(CompteBancaire compte) throws Exception;

	public void updateCompte(CompteBancaire compte) throws Exception;

	public void deleteCompteByNum(Long numCompte) throws Exception;

	public CompteBancaire findCompteByNum(Long numCompte) throws Exception;

	public List<CompteBancaire> findAllCompte() throws Exception;
	
	public List<CompteBancaire> findAllComptesByClient(Client client)throws Exception ;

	public void createCompteForClient(CompteBancaire compte, Client client) throws Exception;

	public void virement(Long numCompte1, Long numCompte2, double montant) throws Exception;
}
