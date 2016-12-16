package org.formation.dao;

import java.util.List;

import org.formation.model.Client;

public interface IDaoClient {

	public void createClient(Client c);

	public void updateClient(Client c);

	public void deleteClient(Client c);

	public Client findClientById(Long idClient);

	public List<Client> findAllClient();

}
