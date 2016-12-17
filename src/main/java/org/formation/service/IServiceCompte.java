package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;

public interface IServiceCompte {

	public void createCompte(CompteBancaire compte) throws Exception;

	public void updateCompte(CompteBancaire compte) throws Exception;

	public void deleteCompteById(Long numCompte) throws Exception;

	public CompteBancaire findCompteById(Long numCompte) throws Exception;

	public List<CompteBancaire> findAllCompte() throws Exception;

	public void createCompteForClient(CompteBancaire compte, Client client) throws Exception;
}
