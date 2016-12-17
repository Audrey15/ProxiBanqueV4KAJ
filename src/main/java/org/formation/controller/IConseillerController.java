package org.formation.controller;

import java.util.List;

import org.formation.model.Conseiller;

public interface IConseillerController {
	
	public String createConseiller(Conseiller conseiller) throws Exception;
	
	public String updateConseiller(Conseiller conseiller) throws Exception;
	
	public String deleteConseillerById(Long idCons) throws Exception;
	
	public List<Conseiller> findAllConseillers() throws Exception;
	
	public String loadConseillerForClients(Long idCons) throws Exception;
}
