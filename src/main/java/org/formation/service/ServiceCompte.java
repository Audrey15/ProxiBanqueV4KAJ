package org.formation.service;

import java.util.List;

import javax.annotation.Resource;

import org.formation.dao.IDaoClient;
import org.formation.dao.IDaoCompte;
import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.springframework.stereotype.Service;

@Service
public class ServiceCompte implements IServiceCompte {

	@Resource(name="daoCompte")
	private IDaoCompte daoCompte;
	
	@Resource
	private IDaoClient daoClient;
	
	@Override
	public void createCompte(CompteBancaire compte) {
		daoCompte.create(compte);
	}

	@Override
	public void updateCompte(CompteBancaire compte) {
		daoCompte.update(compte);
	}

	@Override
	public void deleteCompteById(Long numCompte) {
		daoCompte.delete(numCompte);
	}

	@Override
	public CompteBancaire findCompteById(Long numCompte) {
		return daoCompte.findEById(numCompte);
	}

	@Override
	public List<CompteBancaire> findAllCompte() {
		return daoCompte.findAll();
	}

	@Override
	public void createCompteForClient(CompteBancaire compte, Client client) {
		daoCompte.create(compte);
		client.addCompte(compte);
		daoCompte.update(compte);
		daoClient.update(client);
	}

}
