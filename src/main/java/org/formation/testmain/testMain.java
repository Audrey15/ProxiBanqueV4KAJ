package org.formation.testmain;

<<<<<<< HEAD
import org.formation.dao.DaoClientImpl;
import org.formation.dao.IDaoClient;
=======
<<<<<<< HEAD
=======
>>>>>>> origin/master
import org.formation.model.Client;
import org.formation.service.IServiceClient;
import org.formation.service.ServiceClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


>>>>>>> origin/master
public class testMain {

	public static void main(String[] args) {
<<<<<<< HEAD

=======
		
		
<<<<<<< HEAD
		IDaoClient daoClient = new DaoClientImpl();
//		IServiceClient serviceClient = new ServiceClient();
=======
		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/applicationContext-db-mysql.xml");
		IServiceClient serviceClient =	context.getBean(ServiceClient.class);
				
		
>>>>>>> origin/master
		Client c = new Client();
//		System.out.println(serviceClient);
//		System.out.println(c);
		
		daoClient.create(c);
		
>>>>>>> origin/master
	}

}
