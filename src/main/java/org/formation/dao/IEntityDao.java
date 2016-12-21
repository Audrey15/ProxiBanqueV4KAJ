package org.formation.dao;

import java.util.List;

/**
 * @author Adminl
 *
 * @param <E>
 * Interface dao générique
 */
public interface IEntityDao<E> {

	/**
	 * @param e
	 * @throws Exception
	 * Persister un élément en base de données
	 */
	public void create(E e) throws Exception;

	/**
	 * @param e
	 * @throws Exception
	 * Mettre un jour un élément
	 */
	public void update(E e) throws Exception;

	/**
	 * @param id
	 * @throws Exception
	 * Supprimer un élement de la base de données
	 */
	public void delete(Object id) throws Exception;

	/**
	 * @param id
	 * @return
	 * @throws Exception
	 * Retrouver un élément via sa clé primaire
	 */
	public E findEById(Object id) throws Exception;

	/**
	 * @return
	 * @throws Exception
	 * Retourne une liste de tous les éléments
	 */
	public List<E> findAll() throws Exception;

	/**
	 * @return
	 * @throws Exception
	 * Méthode utilisée pour les tests unitaires
	 * Permet de compter le nombre d'éléments
	 */
	long count() throws Exception;

}
