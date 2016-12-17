package org.formation.controller;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.Conseiller;

public interface IClientController {

	public String createClient(Client client);
	
	public String updateClient(Client client);
	
	public String deleteClientById(Long idCli);
	
	public List<Client> findAllClients();
	
	public List<Client> findAllClientsByConseiller(Conseiller conseiller);
	
	public String loadClientForUpdate(Long idCli);

	public String loadClientForInfo(Long idCli);

	public String loadClientForComptes(Long idCli);

	public String loadClientForAjoutCompte(Long idCli);
	
}
