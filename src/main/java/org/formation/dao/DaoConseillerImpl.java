package org.formation.dao;

import org.formation.model.Conseiller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("daoConseiller")
@Transactional
public class DaoConseillerImpl extends EntityDaoImpl<Conseiller> implements IDaoConseiller {

}
