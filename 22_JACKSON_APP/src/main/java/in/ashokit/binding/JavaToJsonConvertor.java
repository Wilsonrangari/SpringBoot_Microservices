package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConvertor {
	
	public static void main(String[] args) throws Exception {
		
		Address addr= new Address();
		addr.setCity("NGP");
		addr.setState("MH");
		addr.setCountry("INDIA");
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("Wilson");
		c.setEmail("wilson@gmail.com");
		c.setPhno(123456);
		c.setAddress(addr);
	
		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);  //mapper.writeValue(i.e into a file so thtas why we are doing new File(customer.json))9creating new file named customer.json and my object is customer object c
		System.out.println("JSON file is created");
	}

}
