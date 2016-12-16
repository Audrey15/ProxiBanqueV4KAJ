package org.formation.testmain;

import org.formation.model.Client;
import org.formation.service.IServiceClient;
import org.formation.service.ServiceClient;


public class testMain {
	

	public static void main(String[] args) {
		
		
		IServiceClient serviceClient = new ServiceClient();
		Client c = new Client();
		System.out.println(serviceClient);
		System.out.println(c);
		
		serviceClient.createClient(c);
		
	}

}
