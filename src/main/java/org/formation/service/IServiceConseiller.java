package org.formation.service;

import java.util.List;


import org.formation.model.Conseiller;

public interface IServiceConseiller {

	public void createConseiller(Conseiller cons) throws Exception;

	public void updateConseiller(Conseiller cons) throws Exception;

	public void deleteConseillerById(Long idCons) throws Exception;

	public Conseiller findConseillerById(Long idCons) throws Exception;

	public List<Conseiller> findAllConseiller() throws Exception;

}
