package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.Conseiller;

public interface IServiceClient {

	public void createClient(Client c);
	
	public void updateClient(Client c);
	
	public void deleteClientById(Long idClient);
	
	public Client findClientById(Long idClient);
	
	public List<Client> findAllClients();
	
	public List<Client> findAllClientsByConseiller(Conseiller conseiller);

	public void createClientForConseiller(Client client, Conseiller conseiller);
	
}
