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
		daoConseiller.create(cons);
	}

	@Override
	public void updateConseiller(Conseiller cons) {
		daoConseiller.update(cons);
	}

	@Override
	public void deleteConseillerById(Long idCons) {
		daoConseiller.delete(idCons);
	}

	@Override
	public Conseiller findConseillerById(Long idCons) {
		return daoConseiller.findEById(idCons);
	}

	@Override
	public List<Conseiller> findAllConseiller() {
		return daoConseiller.findAll();
	}

}
