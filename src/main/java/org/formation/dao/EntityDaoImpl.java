package org.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public class EntityDaoImpl<E> implements IEntityDao<E> {

	@PersistenceContext(unitName = "persistenceUnit")
	protected EntityManager entityManager;

	protected E instance;
	private Class<E> entityClass;

	@Transactional
	@Override
	public void create(E e) {
		entityManager.persist(e);
	}

	@Transactional
	@Override
	public void updtate(E e) {
		entityManager.merge(e);

	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public E findEById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
