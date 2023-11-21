package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		
		  Car c = context.getBean(Car.class); 
		  c.drive();
		 
		
		
		/*
		 * Car c1 = context.getBean(Car.class); System.out.println(c1.hashCode());
		 * 
		 * Car c2 = context.getBean(Car.class); System.out.println(c2.hashCode());
		 * 
		 * Car c3 = context.getBean(Car.class); System.out.println(c3.hashCode());
		 */
		

	}

}
