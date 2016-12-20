package org.formation.service;

import java.util.ArrayList;
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
	public void createCompte(CompteBancaire compte) throws Exception{
		daoCompte.create(compte);
	}

	@Override
	public void updateCompte(CompteBancaire compte)throws Exception {
		daoCompte.update(compte);
	}

	@Override
	public void deleteCompteByNum(Long numCompte)throws Exception {
		daoCompte.delete(numCompte);
	}

	@Override
	public CompteBancaire findCompteByNum(Long numCompte) throws Exception{
		return daoCompte.findEById(numCompte);
	}

	@Override
	public List<CompteBancaire> findAllCompte() throws Exception{
		return daoCompte.findAll();
	}

	@Override
	public void createCompteForClient(CompteBancaire compte, Client client)throws Exception {
		client.addCompte(compte);
		daoClient.update(client);
	}

	
	@Override
	public List<CompteBancaire> findAllComptesByClient(Client client) throws Exception {
		List<CompteBancaire> listeComptes = daoCompte.findAll();
		List<CompteBancaire> listeComptesByClient = new ArrayList<>();
		for(CompteBancaire compte:listeComptes){
			if(compte.getClient().equals(client)){
				listeComptesByClient.add(compte);
			}
		}
		return listeComptesByClient;
	}

	@Override
	public void virement(CompteBancaire compte1, CompteBancaire compte2, double montant) throws Exception {
		double s1 = compte1.getSolde();
		double s2 = compte2.getSolde();
		s1 = s1 - montant;
		s2 = s2 + montant;
		compte1.setSolde(s1);
		compte2.setSolde(s2);
		daoCompte.update(compte1);
		daoCompte.update(compte2);
		
	}

	
	
}
