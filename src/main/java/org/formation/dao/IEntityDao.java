package org.formation.dao;

import java.util.List;

public interface IEntityDao<E> {

	public void create(E e);

	public void update(E e);

	public void delete(Object id);

	public E findEById(Object id);

	public List<E> findAll();

}
