package org.formation.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.formation.dao.DaoClientImpl;
import org.formation.dao.IDaoClient;
import org.formation.dao.IDaoConseiller;
import org.formation.dao.IEntityDao;
import org.formation.model.Client;
import org.formation.model.Conseiller;
import org.springframework.stereotype.Service;

/**
 * @author KAJ Classe service client
 */
@Service("serviceClient")
public class ServiceClient implements IServiceClient {

	/**
	 * Injection de la dao client
	 */
	@Resource
	private IDaoClient daoClient;

	/**
	 * Injection de la dao conseiller
	 */
	@Resource
	private IDaoConseiller daoConseiller;

	@Override
	public void createClient(Client c) throws Exception {
		daoClient.create(c);

	}

	@Override
	public void updateClient(Client c) throws Exception {
		daoClient.update(c);
	}

	@Override
	public void deleteClientById(Long idClient) throws Exception {
		daoClient.delete(idClient);
	}

	@Override
	public Client findClientById(Long idClient) throws Exception {
		return daoClient.findEById(idClient);
	}

	@Override
	public List<Client> findAllClients() throws Exception {
		return daoClient.findAll();
	}

	@Override
	public void createClientForConseiller(Client client, Conseiller conseiller) throws Exception {
		daoClient.create(client);
		conseiller.addClient(client);
		daoClient.update(client);
		daoConseiller.update(conseiller);
	}

	@Override
	public List<Client> findAllClientsByConseiller(Conseiller conseiller) throws Exception {
		List<Client> listeClients = daoClient.findAll();
		List<Client> listeClientsByConseiller = new ArrayList<>();
		for (Client client : listeClients) {
			if (client.getConseiller().equals(conseiller)) {
				listeClientsByConseiller.add(client);
			}
		}
		return listeClientsByConseiller;
	}

}
