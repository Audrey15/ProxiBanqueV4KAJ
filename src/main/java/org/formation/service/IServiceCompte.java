package org.formation.service;

import java.util.List;


import org.formation.model.CompteBancaire;

public interface IServiceCompte {

	public void createCompte(CompteBancaire compte);

	public void updateCompte(CompteBancaire compte);

	public void deleteCompteById(CompteBancaire compte);

	public CompteBancaire findCompteById(Long numCompte);

	public List<CompteBancaire> findAllCompte();
}
