package org.formation.service;

import java.util.List;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.model.Conseiller;

/**
 * @author KAJ
 * Interface service compte
 */
public interface IServiceCompte {

	/**
	 * @param compte
	 * @throws Exception
	 * Créer un compte bancaire
	 */
	public void createCompte(CompteBancaire compte) throws Exception;

	
	/**
	 * @param compte
	 * @throws Exception
	 * Mettre à jour un compte bancaire
	 */
	public void updateCompte(CompteBancaire compte) throws Exception;

	/**
	 * @param numCompte
	 * @throws Exception
	 * Supprimer un compte via son numéro
	 */
	public void deleteCompteByNum(Long numCompte) throws Exception;

	/**
	 * @param numCompte
	 * @return
	 * @throws Exception
	 * Retrouver un compte bancaire via son numéro
	 */
	public CompteBancaire findCompteByNum(Long numCompte) throws Exception;

	/**
	 * @return
	 * @throws Exception
	 * Retrouver tous les comptes bancaires
	 */
	public List<CompteBancaire> findAllCompte() throws Exception;
	
	
	/**
	 * @param client
	 * @return
	 * @throws Exception
	 * Retrouver les comptes bancaires d'un client
	 */
	public List<CompteBancaire> findAllComptesByClient(Client client)throws Exception ;

	/**
	 * @param compte
	 * @param client
	 * @throws Exception
	 * Créer un compte bancaire pour un client
	 */
	public void createCompteForClient(CompteBancaire compte, Client client) throws Exception;

	
	/**
	 * @param numCompte1
	 * @param numCompte2
	 * @param montant
	 * @throws Exception
	 * Effectuer un virement de compte à compte
	 */
	public void virement(Long numCompte1, Long numCompte2, double montant) throws Exception;
}
