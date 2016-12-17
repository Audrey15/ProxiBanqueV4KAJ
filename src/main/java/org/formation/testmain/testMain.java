package org.formation.testmain;

import org.formation.dao.DaoClientImpl;
import org.formation.dao.IDaoClient;
import org.formation.model.Client;
import org.formation.service.IServiceClient;
import org.formation.service.ServiceClient;


public class testMain {
	

	public static void main(String[] args) {
		
		IDaoClient daoClient = new DaoClientImpl();
//		IServiceClient serviceClient = new ServiceClient();
		Client c = new Client();
//		System.out.println(serviceClient);
//		System.out.println(c);
		
		daoClient.create(c);
		
	}

}
