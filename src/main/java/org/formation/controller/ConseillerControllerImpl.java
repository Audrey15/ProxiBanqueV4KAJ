package org.formation.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.formation.service.IServiceClient;
import org.formation.service.IServiceConseiller;

public class ConseillerControllerImpl implements IConseillerController{

	@Resource
	IServiceConseiller serviceConseiller;
	
	private List<Client> listeConseillers = new ArrayList<>();
	
	@Override
	public String createConseiller(Conseiller conseiller) {
		serviceConseiller.createConseiller(conseiller);
		return "listeConseillers";
	}

	@Override
	public String updateConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return "listeConseillers";
	}

	@Override
	public String deleteConseillerById(Long idCons) {
		// TODO Auto-generated method stub
		return "listeConseillers";
	}

	@Override
	public List<Conseiller> findAllConseillers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loadConseillerForClients(Long idCons) {
		// TODO Auto-generated method stub
		return null;
	}

}
