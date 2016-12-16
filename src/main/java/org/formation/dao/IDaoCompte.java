package org.formation.dao;

import java.util.List;

import org.formation.model.CompteBancaire;

public interface IDaoCompte {

	public void createCompte(CompteBancaire compte);

	public void updtateCompte(CompteBancaire compte);

	public void deleteCompte(CompteBancaire compte);

	public CompteBancaire findCompteByNum(Long numCompte);

	public List<CompteBancaire> findAllCompte();

}
