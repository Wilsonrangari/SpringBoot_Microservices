package in.ashokit.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


public class MarshalDemo {
	
	public static void main(String[] args) throws Exception {
		
		Customer c = new Customer();
		
		c.setId(1);
		c.setName("Wilson");
		c.setEmail("wilson@gmail.com");
		c.setPhno( 45612345);
		
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		
		Marshaller marshaller = context.createMarshaller(); //to creat marshaller object we need jaxbcontext object of thta class
		marshaller.marshal(c, new File("customer.xml"));
		System.out.println("XML Created");
	}

}
