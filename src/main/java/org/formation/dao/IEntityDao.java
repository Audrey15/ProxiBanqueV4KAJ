package org.formation.dao;

import java.util.List;

public interface IEntityDao<E> {

	public void create(E e) throws Exception;

	public void update(E e) throws Exception;

	public void delete(Object id) throws Exception;

	public E findEById(Object id) throws Exception;

	public List<E> findAll() throws Exception;

	long count() throws Exception;

}
