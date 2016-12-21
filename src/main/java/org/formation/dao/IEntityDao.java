package org.formation.dao;

import java.util.List;

/**
 * @author Adminl
 *
 * @param <E>
 * Interface dao g�n�rique
 */
public interface IEntityDao<E> {

	/**
	 * @param e
	 * @throws Exception
	 * Persister un �l�ment en base de donn�es
	 */
	public void create(E e) throws Exception;

	/**
	 * @param e
	 * @throws Exception
	 * Mettre un jour un �l�ment
	 */
	public void update(E e) throws Exception;

	/**
	 * @param id
	 * @throws Exception
	 * Supprimer un �lement de la base de donn�es
	 */
	public void delete(Object id) throws Exception;

	/**
	 * @param id
	 * @return
	 * @throws Exception
	 * Retrouver un �l�ment via sa cl� primaire
	 */
	public E findEById(Object id) throws Exception;

	/**
	 * @return
	 * @throws Exception
	 * Retourne une liste de tous les �l�ments
	 */
	public List<E> findAll() throws Exception;

	/**
	 * @return
	 * @throws Exception
	 * M�thode utilis�e pour les tests unitaires
	 * Permet de compter le nombre d'�l�ments
	 */
	long count() throws Exception;

}
