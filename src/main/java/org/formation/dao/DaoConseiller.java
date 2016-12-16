package org.formation.dao;

import org.formation.model.Conseiller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DaoConseiller extends EntityDaoImpl<Conseiller> implements IDaoConseiller {

}
