package org.formation.testmain;

import org.formation.model.Client;
import org.formation.model.CompteBancaire;
import org.formation.service.IServiceClient;
import org.formation.service.IServiceCompte;
import org.formation.service.ServiceClient;
import org.formation.service.ServiceCompte;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testMain {
	

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/applicationContext-db-mysql.xml");
		IServiceClient serviceClient =	context.getBean("serviceClient", ServiceClient.class);
		IServiceCompte serviceCompte = context.getBean(ServiceCompte.class);		
		
		Client c = new Client();
		System.out.println(serviceClient);
		System.out.println(c);
		
		serviceClient.createClient(c);
		
		
		CompteBancaire compte = new CompteBancaire();
		serviceCompte.createCompte(compte);
		c.addCompte(compte);
		serviceClient.updateClient(c);
		
	}

}
