package org.formation.dao;

import javax.persistence.Query;

import org.formation.model.CompteBancaire;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author KAJ
 * Classe dao compte
 *
 */
@Repository("daoCompte")
@Transactional
public class DaoCompteImpl extends EntityDaoImpl<CompteBancaire> implements IDaoCompte {
	
}
