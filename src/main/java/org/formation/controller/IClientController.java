package org.formation.controller;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.model.Conseiller;

/**
 * @author KAJ
 * Interface controller client
 *
 */
public interface IClientController {

	/**
	 * @param client
	 * @param compte
	 * @return
	 * @throws Exception
	 * Créer un client
	 */
	public String createClient(Client client, CompteBancaire compte) throws Exception;
	
	/**
	 * @param client
	 * @return
	 * @throws Exception
	 * Modifier un client
	 */
	public String updateClient(Client client)throws Exception;
	
	/**
	 * @param idCli
	 * @return
	 * @throws Exception
	 * Supprimer un client via son ID
	 */
	public String deleteClientById(Long idCli)throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 * Liste de tous les clients
	 */
	public List<Client> findAllClients()throws Exception;
	
	/**
	 * @param conseiller
	 * @return
	 * @throws Exception
	 * Liste des clients d'un conseiller
	 */
	public List<Client> findAllClientsByConseiller(Conseiller conseiller)throws Exception;
	
	/**
	 * @param idCli
	 * @throws Exception
	 * Charger un client via son ID
	 */
	public void loadClient(Long idCli) throws Exception;
	
	/**
	 * @param idCli
	 * @return
	 * @throws Exception
	 * Charger les informations d'un client via son ID pour la modification
	 */
	public String loadClientForUpdate(Long idCli)throws Exception;

	/**
	 * @param idCli
	 * @return
	 * @throws Exception
	 * Charger les informations d'un client via son ID
	 */
	public String loadClientForInfo(Long idCli)throws Exception;

	/**
	 * @param idCli
	 * @return
	 * @throws Exception
	 * Charger les informations d'un client via son ID pour les comptes
	 */
	public String loadClientForComptes(Long idCli)throws Exception;

	/**
	 * @param idCli
	 * @return
	 * @throws Exception
	 * Charger les informations d'un client via son ID pour ajouter un compte
	 */
	public String loadClientForAjoutCompte(Long idCli)throws Exception;
	
	
	
}
