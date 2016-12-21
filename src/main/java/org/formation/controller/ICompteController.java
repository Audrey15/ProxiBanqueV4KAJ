package org.formation.controller;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;

/**
 * @author KAJ
 * Interface controller compte
 *
 */
public interface ICompteController {
	
	/**
	 * @param compte
	 * @param client
	 * @return
	 * @throws Exception
	 * Créer un compte
	 */
	public String createCompteForClient(CompteBancaire compte, Client client) throws Exception;
	
	/**
	 * @param compte
	 * @return
	 * @throws Exception
	 * Modifier un compte
	 */
	public String updateCompte(CompteBancaire compte)throws Exception;
	
	/**
	 * @param numCompte
	 * @return
	 * @throws Exception
	 * Supprimer un compte via son ID
	 */
	public String deleteCompteByNum(Long numCompte)throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 * Liste de tous les comptes
	 */
	public List<CompteBancaire> findAllComptes()throws Exception;
	
	/**
	 * @param client
	 * @return
	 * @throws Exception
	 * Liste des comptes par client
	 */
	public List<CompteBancaire> findAllComptesByClient(Client client)throws Exception;
	
	/**
	 * @param numCompte
	 * @throws Exception
	 * Charger un compte via son numéro
	 */
	public void loadCompte(Long numCompte) throws Exception;
	
	/**
	 * @param numCompte1
	 * @param numCompte2
	 * @param montant
	 * @return
	 * @throws Exception
	 * Faire un virement de compte à compte
	 */
	public String virement(Long numCompte1, Long numCompte2, double montant)throws Exception;

}
