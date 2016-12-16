package org.formation.service;

import java.util.List;

import javax.annotation.Resource;

import org.formation.dao.IDaoConseiller;
import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.springframework.stereotype.Service;

@Service
public class ServiceConseiller implements IServiceConseiller {

	@Resource(name="daoConseiller")
	private IDaoConseiller daoConseiller;

	@Override
	public void createConseiller(Conseiller cons) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateConseiller(Conseiller cons) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteConseillerById(Conseiller cons) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conseiller findConseillerById(Conseiller cons) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conseiller> findAllConseiller() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
