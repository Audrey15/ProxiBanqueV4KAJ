package org.formation.service;

import java.util.List;

import javax.annotation.Resource;

import org.formation.dao.DaoClientImpl;
import org.formation.dao.IDaoClient;
import org.formation.dao.IEntityDao;
import org.formation.model.Client;
import org.springframework.stereotype.Service;

@Service
public class ServiceClient implements IServiceClient{

	@Resource
	private IDaoClient daoClient;
	
	
	@Override
	public void createClient(Client c) {
		daoClient.create(c);
		
	}

	@Override
	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClientById(Long idClient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findClientById(Long idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

}
