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

	@Transactional
	@Override
	public void delete(Object id) {
		entityManager.remove(entityManager.find(entityClass, id));
	}

	@Transactional
	@Override
	public E findEById(Object id) {
		return (E) entityManager.find(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<E> findAll() {
		return entityManager.createQuery("Select t from " + entityClass.getSimpleName() + " t")
				.getResultList();
	}

}
