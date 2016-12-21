package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.Conseiller;

/**
 * @author KAJ
 * 
 *         Interface service client
 */

public interface IServiceClient {

	/**
	 * @param c
	 * @throws Exception
	 *             Créer un client
	 */
	public void createClient(Client c) throws Exception;

	/**
	 * @param c
	 * @throws Exception
	 *             Mettre à jour les informations d'un client
	 */
	public void updateClient(Client c) throws Exception;

	/**
	 * @param idClient
	 * @throws Exception
	 *             Supprimer un client via son Id
	 */
	public void deleteClientById(Long idClient) throws Exception;

	/**
	 * @param idClient
	 * @return
	 * @throws Exception
	 *             Retrouver un client via son Id
	 */
	public Client findClientById(Long idClient) throws Exception;

	/**
	 * @return
	 * @throws Exception
	 *             Retrouver tous les clients
	 */
	public List<Client> findAllClients() throws Exception;

	public List<Client> findAllClientsByConseiller(Conseiller conseiller) throws Exception;

	public void createClientForConseiller(Client client, Conseiller conseiller) throws Exception;

}
