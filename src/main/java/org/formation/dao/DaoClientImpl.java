package org.formation.dao;

import java.util.List;

import javax.persistence.Query;

import org.formation.model.Client;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DaoClientImpl extends EntityDaoImpl<Client> implements IDaoClient {

	@Override
	public Client findEById(Object id) throws Exception {
		Query query = entityManager.createQuery("select c from Client c join fetch c.listeComptes where c.idClient = " + id);
		return (Client) query.getSingleResult();
	}

	@Override
	public List<Client> findAll() throws Exception {
		Query query = entityManager.createQuery("select c from Client c join fetch c.listeComptes");
		return query.getResultList();
	}

}
