package org.formation.controller;

import java.util.List;

import org.formation.model.Conseiller;

public interface IConseillerController {
	
	public String createConseiller(Conseiller conseiller);
	
	public String updateConseiller(Conseiller conseiller);
	
	public String deleteConseillerById(Long idCons);
	
	public List<Conseiller> findAllConseillers();
	
	public String loadConseillerForClients(Long idCons);
}
