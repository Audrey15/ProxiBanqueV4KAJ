package org.formation.dao;

import org.formation.model.CompteBancaire;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DaoCompte extends EntityDaoImpl<CompteBancaire> implements IDaoCompte {

}
