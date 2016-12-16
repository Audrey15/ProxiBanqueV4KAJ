package org.formation.service;

import java.util.List;

import javax.annotation.Resource;

import org.formation.dao.IDaoCompte;
import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.springframework.stereotype.Service;

@Service
public class ServiceCompte implements IServiceCompte {

	@Resource(name="daoCompte")
	private IDaoCompte daoCompte;

	@Override
	public void createCompte(CompteBancaire compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompte(CompteBancaire compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompteById(CompteBancaire compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompteBancaire findCompteById(Long numCompte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompteBancaire> findAllCompte() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
