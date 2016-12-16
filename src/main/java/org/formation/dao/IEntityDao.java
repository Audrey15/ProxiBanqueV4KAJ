package org.formation.dao;

import java.util.List;

import org.formation.model.CompteBancaire;

public interface IEntityDao<E> {

	public void create(E e);

	public void updtate(E e);

	public void delete(Object id);

	public E findEById(Object id);

	public List<E> findAll();

}
