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
	public void createConseiller(Conseiller cons) throws Exception{
		daoConseiller.create(cons);
	}

	@Override
	public void updateConseiller(Conseiller cons)throws Exception {
		daoConseiller.update(cons);
	}

	@Override
	public void deleteConseillerById(Long idCons)throws Exception {
		daoConseiller.delete(idCons);
	}

	@Override
	public Conseiller findConseillerById(Long idCons) throws Exception{
		return daoConseiller.findEById(idCons);
	}

	@Override
	public List<Conseiller> findAllConseiller()throws Exception {
		return daoConseiller.findAll();
	}

}
