package org.formation.dao;

import org.formation.model.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DaoClientImpl extends EntityDaoImpl<Client> implements IDaoClient {

	

}
