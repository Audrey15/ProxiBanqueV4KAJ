package org.formation.testmain;

import java.util.List;

import org.formation.dao.DaoClientImpl;
import org.formation.dao.IDaoClient;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.model.Conseiller;
import org.formation.model.TypeCompte;
import org.formation.service.IServiceClient;
import org.formation.service.IServiceCompte;
import org.formation.service.IServiceConseiller;
import org.formation.service.ServiceClient;
import org.formation.service.ServiceCompte;
import org.formation.service.ServiceConseiller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/applicationContext-db-mysql.xml");
		IServiceClient serviceClient = context.getBean("serviceClient", ServiceClient.class);
		IServiceCompte serviceCompte = context.getBean(ServiceCompte.class);
		IServiceConseiller serviceConseiller = context.getBean(ServiceConseiller.class);


		// IDaoClient dao = new DaoClientImpl();


		// Client c = new Client("c", "c1", "c1", "c1", "c1", "c1", "c1");
		// Client c2 = new Client("c2", "c2", "c2", "c2", "c2", "c2", "c2");
		//
		//

		// Conseiller cons1 = new Conseiller("cons1", "cons1", "cons1", "cons1",
		// "cons1", "cons1", "cons1", "cons1",
		// "cons1");
		//
		// serviceConseiller.createConseiller(cons1);

		Conseiller cons1 = new Conseiller("cons1", "cons1", "cons1", "cons1", "cons1", "cons1", "cons1", "cons1",
				"cons1");
		
		serviceConseiller.createConseiller(cons1);


		// CompteBancaire compte = new CompteBancaire();

		// c.getListeComptes().add(compte);

		// serviceCompte.createCompte(compte);

		// Client client = serviceClient.findClientById(20L);

//		System.out.println(client);

		// System.out.println(client);


		// client.addCompte(compte);

		// serviceCompte.createCompteForClient(compte, 20L);

		// compte.setClient(c);

		// serviceCompte.createCompte(compte);

		// CompteBancaire compte = serviceCompte.findCompteByNum(numCompte);


//		serviceCompte.createCompteForClient(compte, client);

		// serviceCompte.createCompteForClient(compte, client);


		// Client c = new Client("c1", "c1", "c1", "c1", "c1", "c1", "c1");
		// Client c2 = new Client("c2", "c2", "c2", "c2", "c2", "c2", "c2");
		//
		//
		// Conseiller cons1 = new Conseiller("cons1", "cons1", "cons1", "cons1",
		// "cons1", "cons1", "cons1", "cons1",
		// "cons1");
		//
		// serviceConseiller.createConseiller(cons1);


//		CompteBancaire com = new CompteBancaire(300.0, TypeCompte.COURANT);
//		com.setClient(serviceClient.findClientById(5L));
//		serviceCompte.createCompte(com);
		
		List<CompteBancaire> liste = serviceCompte.findAllCompte();
		System.out.println(liste);

		// CompteBancaire com = new CompteBancaire(300.0, TypeCompte.COURANT);
		// com.setClient(serviceClient.findClientById(5L));
		// serviceCompte.createCompte(com);
		//


	}
}
