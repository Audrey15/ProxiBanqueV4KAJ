package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.Conseiller;

public interface IServiceClient {

	public void createClient(Client c) throws Exception;
	
	public void updateClient(Client c) throws Exception;
	
	public void deleteClientById(Long idClient) throws Exception;
	
	public Client findClientById(Long idClient) throws Exception;
	
<<<<<<< HEAD
	public List<Client> findAllClients() throws Exception;
=======
	public List<Client> findAllClients();
	
	public List<Client> findAllClientsByConseiller(Conseiller conseiller);
>>>>>>> 8b6284c1ed8b89dd674cfe8b3b38c06e4daf8d6a

	public void createClientForConseiller(Client client, Conseiller conseiller) throws Exception;
	
}
