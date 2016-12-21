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
		IServiceCompte serviceCompte = context.getBean("serviceCompte", ServiceCompte.class);
		IServiceConseiller serviceConseiller = context.getBean("serviceConseiller", ServiceConseiller.class);


		Conseiller conseiller = new Conseiller("Dupont", "Bob", "bob.dupont@proxi.fr", "0125487956", "5 rue de la gare", "Paris", "75016", "conseiller", "test");
		
		Client client1 = new Client("Durant", "Maxime", "maxime.durant@gmail.com", "0248796358", "18 boulevard de l'industrie", "Paris", "75016");
		Client client2 = new Client("Bonaventure", "Sylvie", "sylvie.bonaventure@orange.fr", "0698754125", "26 rue des poulies", "Tours", "37000");
		
		CompteBancaire compte1 = new CompteBancaire(300, TypeCompte.COURANT);
		CompteBancaire compte2 = new CompteBancaire(1000, TypeCompte.EPARGNE);
		
		CompteBancaire compte3 = new CompteBancaire(800, TypeCompte.COURANT);
		CompteBancaire compte4 = new CompteBancaire(5000, TypeCompte.EPARGNE);
		
		serviceConseiller.createConseiller(conseiller);
		
		serviceCompte.createCompte(compte1);
		serviceCompte.createCompte(compte2);
		serviceCompte.createCompte(compte3);
		serviceCompte.createCompte(compte4);
		
		client1.addCompte(compte1);
		client1.addCompte(compte2);
		client2.addCompte(compte3);
		client2.addCompte(compte4);
		
		serviceClient.updateClient(client1);
		serviceClient.updateClient(client2);
		
		
		
		

	}
}
