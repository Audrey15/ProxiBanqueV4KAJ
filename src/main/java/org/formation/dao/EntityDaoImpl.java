package org.formation.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javassist.bytecode.SignatureAttribute.TypeVariable;

/**
 * @author Adminl
 *
 * @param <E>
 * 
 * classe g�n�rique dao, impl�mente l'interface g�n�rique
 */
@Repository
public class EntityDaoImpl<E> implements IEntityDao<E> {

	@PersistenceContext(unitName = "persistenceUnit")
	protected EntityManager entityManager;

	protected E instance;
	private Class<E> entityClass;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	@Override
	public void create(E e) throws HibernateException {
		getEntityManager().persist(e);
	}

	@Transactional
	@Override
	public void update(E e) throws HibernateException {
		getEntityManager().merge(e);
	}

	@Transactional
	@Override
	public void delete(Object id) throws Exception {
		getEntityManager().remove(getEntityManager().find(getEntityClass(), id));
	}

	@Transactional(readOnly = true)
	@Override
	public E findEById(Object id) throws Exception {
		return (E) getEntityManager().find(getEntityClass(), id);
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	@Override
	public List<E> findAll() throws Exception {
		return getEntityManager().createQuery("Select t from " + getEntityClass().getSimpleName() + " t" )
				.getResultList();
	}

	@Override
	public long count() throws Exception {
		return (Long) getEntityManager().createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t")
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public Class<E> getEntityClass() throws Exception {
		if (entityClass == null) {
			Type type = getClass().getGenericSuperclass();
			if (type instanceof ParameterizedType) {
				ParameterizedType paramType = (ParameterizedType) type;
				if (paramType.getActualTypeArguments().length == 2) {
					if (paramType.getActualTypeArguments()[1] instanceof TypeVariable) {
						throw new IllegalArgumentException("Can't find class using reflection");
					} else {
						entityClass = (Class<E>) paramType.getActualTypeArguments()[1];
					}
				} else {
					entityClass = (Class<E>) paramType.getActualTypeArguments()[0];
				}
			} else {
				throw new Exception("Can't find class using reflection");
			}
		}
		return entityClass;
	}

}
