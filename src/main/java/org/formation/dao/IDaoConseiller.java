package org.formation.dao;

import java.util.List;

import org.formation.model.Conseiller;

public interface IDaoConseiller {
	
	public void createConseiller(Conseiller cons);
	
	public void updateConseiller(Conseiller cons);
	
	public void deleteConseiller(Conseiller cons);
	
	public Conseiller findConseillerById(Long idCons);
	
	public List<Conseiller> findAllConseiller();

}
