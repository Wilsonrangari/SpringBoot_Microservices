package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//To create object using Beans file we use ApplicationContext
		//IOC is creating object for our class when we are crating  object of ClassPathXmlApplicationContext();
		//IOc container is started
		//all the objects will be created which are mentioned in the beans.xml as bean tag
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		//to get the object from Beans.xml use getBean method
		PaymentService service = context.getBean(PaymentService.class);
		
		service.doPayment(100.158);
	}

}
