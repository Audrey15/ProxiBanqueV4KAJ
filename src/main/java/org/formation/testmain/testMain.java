package org.formation.testmain;

import org.formation.dao.DaoClientImpl;
import org.formation.dao.IDaoClient;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.model.Conseiller;
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

		// Client c = new Client("c1", "c1", "c1", "c1", "c1", "c1", "c1");
		// Client c2 = new Client("c2", "c2", "c2", "c2", "c2", "c2", "c2");
		// System.out.println(serviceClient);
		// System.out.println(c);

		// serviceClient.createClient(c);
		// serviceClient.createClient(c2);

		Conseiller cons1 = new Conseiller("cons1", "cons1", "cons1", "cons1", "cons1", "cons1", "cons1", "cons1",
				"cons1");
		
		serviceConseiller.createConseiller(cons1);

	}
}
