package org.formation.testmain;

import org.formation.model.Client;
import org.formation.service.IServiceClient;
import org.formation.service.ServiceClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testMain {
	

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/applicationContext-db-mysql.xml");
		IServiceClient serviceClient =	context.getBean(ServiceClient.class);
				
		
		Client c = new Client();
		System.out.println(serviceClient);
		System.out.println(c);
		
		serviceClient.createClient(c);
		
	}

}
