package org.formation.testunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.formation.config.ConfigurationClasse;
import org.formation.dao.DaoClientImpl;
import org.formation.dao.DaoCompteImpl;
import org.formation.dao.DaoConseillerImpl;
import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.model.Conseiller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration (locations = {"/META-INF/spring/applicationContext-db-mysql.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class persistenceTest {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	DaoClientImpl daoClient;
	
	@Autowired
	DaoConseillerImpl daoConseiller;
	
	@Autowired
	DaoCompteImpl daoCompte;
	
	@Test
	@Transactional
	public void testDaoClientImpl() throws Exception {
		Client client = new Client();
		daoClient.create(client);
		assertNotNull(daoClient);
	}
	
//	@Test
//	@Transactional
//	public void testDaoConseillerImpl() throws Exception {
//		Conseiller cons = new Conseiller();
//		daoConseiller.create(cons);
//		assertEquals(1, daoConseiller.count());
//	}
//
//	@Test
//	@Transactional
//	public void testDaoCompteImpl() throws Exception {
//		CompteBancaire compte = new CompteBancaire();
//		daoCompte.create(compte);
//		assertEquals(1, daoCompte.count());
//	}
	
}
