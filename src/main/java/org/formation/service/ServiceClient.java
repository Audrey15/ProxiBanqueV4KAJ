package org.formation.service;

import java.util.List;

import javax.annotation.Resource;

import org.formation.dao.DaoClientImpl;
import org.formation.dao.IDaoClient;
import org.formation.dao.IDaoConseiller;
import org.formation.dao.IEntityDao;
import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.springframework.stereotype.Service;

@Service
public class ServiceClient implements IServiceClient{

	@Resource
	private IDaoClient daoClient;
	
	@Resource
	private IDaoConseiller daoConseiller;
	
	@Override
	public void createClient(Client c) {
		daoClient.create(c);	
	}

	@Override
	public void updateClient(Client c) {
		daoClient.update(c);
	}

	@Override
	public void deleteClientById(Long idClient) {
		daoClient.delete(idClient);
	}

	@Override
	public Client findClientById(Long idClient) {
		return daoClient.findEById(idClient);
	}

	@Override
	public List<Client> findAllClients() {
		return daoClient.findAll();
	}

	@Override
	public void createClientForConseiller(Client client, Conseiller conseiller) {
		daoClient.create(client);
		conseiller.addClient(client);
		daoClient.update(client);
		daoConseiller.update(conseiller);
	}

}
