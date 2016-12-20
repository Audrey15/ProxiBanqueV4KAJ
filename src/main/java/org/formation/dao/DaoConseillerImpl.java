package org.formation.dao;

import java.util.List;

import javax.persistence.Query;

import org.formation.model.Conseiller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("daoConseiller")
@Transactional
public class DaoConseillerImpl extends EntityDaoImpl<Conseiller> implements IDaoConseiller {

	@Override
	public Conseiller findEById(Object id) throws Exception {
		Query query = entityManager.createQuery("select c from Conseiller c join fetch c.listeClients where c.idCons = " + id);
		return (Conseiller) query.getSingleResult();
	}

	@Override
	public List<Conseiller> findAll() throws Exception {
		Query query = entityManager.createQuery("select c from Conseiller c");
		return query.getResultList();
	}
	
}
