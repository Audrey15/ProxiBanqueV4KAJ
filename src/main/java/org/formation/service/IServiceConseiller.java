package org.formation.service;

import java.util.List;


import org.formation.model.Conseiller;

public interface IServiceConseiller {

	public void createConseiller(Conseiller cons);

	public void updateConseiller(Conseiller cons);

	public void deleteConseillerById(Conseiller cons);

	public Conseiller findConseillerById(Conseiller cons);

	public List<Conseiller> findAllConseiller();

}
