package in.ashokit;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctxt= new ClassPathXmlApplicationContext("Beans.xml"); 
		UserDao dao = ctxt.getBean(UserDao.class);
		dao.getData();
		
		//how to close IOC CONTAINER
		//ConfigurableApplicationContext it is a super interface for the ApplicationContext
		ConfigurableApplicationContext cctxt=(ConfigurableApplicationContext) ctxt;
		
		cctxt.close();
		

	}

}
