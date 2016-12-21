package org.formation.controller;

import java.util.List;

import org.formation.model.Conseiller;

/**
 * @author KAJ
 * Interface controller conseiller
 *
 */
public interface IConseillerController {
	
	/**
	 * @param conseiller
	 * @return
	 * @throws Exception
	 *Créer un conseiller
	 */
	public String createConseiller(Conseiller conseiller) throws Exception;
	
	/**
	 * @param conseiller
	 * @return
	 * @throws Exception
	 * Mettre à jour un conseiller
	 */
	public String updateConseiller(Conseiller conseiller) throws Exception;
	
	/**
	 * @param idCons
	 * @return
	 * @throws Exception
	 * Supprimer un conseiller via son ID
	 */
	public String deleteConseillerById(Long idCons) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 * Liste de tous les conseillers
	 */
	public List<Conseiller> findAllConseillers() throws Exception;
	
	/**
	 * @param idCons
	 * @throws Exception
	 * Charger un conseiller via son ID
	 */
	public void loadConseiller(Long idCons) throws Exception;
	
	/**
	 * @param idCons
	 * @return
	 * @throws Exception
	 * Charger les informations d'un conseiller via son ID
	 */
	public String loadConseillerForInfo(Long idCons) throws Exception;
	
	/**
	 * @param idCons
	 * @return
	 * @throws Exception
	 * Charger les informations d'un conseiller via son ID pour la modification
	 */
	public String loadConseillerForUpdate(Long idCons) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 * Déconnexion
	 */
	public String deconnection() throws Exception;
}
