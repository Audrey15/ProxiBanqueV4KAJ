package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.Conseiller;

public interface IServiceClient {

	public void createClient(Client c) throws Exception;
	
	public void updateClient(Client c) throws Exception;
	
	public void deleteClientById(Long idClient) throws Exception;
	
	public Client findClientById(Long idClient) throws Exception;
	
	public List<Client> findAllClients() throws Exception;

	public void createClientForConseiller(Client client, Conseiller conseiller) throws Exception;
	
}
