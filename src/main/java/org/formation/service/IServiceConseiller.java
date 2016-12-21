package org.formation.service;

import java.util.List;


import org.formation.model.Conseiller;

/**
 * @author KAJ
 * Interface service conseiller
 */
public interface IServiceConseiller {

	/**
	 * @param cons
	 * @throws Exception
	 * Créer un conseiller
	 */
	public void createConseiller(Conseiller cons) throws Exception;

	/**
	 * @param cons
	 * @throws Exception
	 * Mettre à jour les informations
	 */
	public void updateConseiller(Conseiller cons) throws Exception;

	/**
	 * @param idCons
	 * @throws Exception
	 * Supprimer un conseiller via son Id
	 */
	public void deleteConseillerById(Long idCons) throws Exception;

	/**
	 * @param idCons
	 * @return
	 * @throws Exception
	 * Retrouver un conseiller via son Id
	 */
	public Conseiller findConseillerById(Long idCons) throws Exception;

	/**
	 * @return
	 * @throws Exception
	 * Retrouver tous les conseillers
	 */
	public List<Conseiller> findAllConseiller() throws Exception;

}
