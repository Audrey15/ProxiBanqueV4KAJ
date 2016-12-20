package org.formation.controller;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.model.Conseiller;

public interface IClientController {

	public String createClient(Client client, CompteBancaire compte) throws Exception;
	
	public String updateClient(Client client)throws Exception;
	
	public String deleteClientById(Long idCli)throws Exception;
	
	public List<Client> findAllClients()throws Exception;
	
	public List<Client> findAllClientsByConseiller(Conseiller conseiller)throws Exception;
	
	public String loadClientForUpdate(Long idCli)throws Exception;

	public String loadClientForInfo(Long idCli)throws Exception;

	public String loadClientForComptes(Long idCli)throws Exception;

	public String loadClientForAjoutCompte(Long idCli)throws Exception;
	
	
	
}
