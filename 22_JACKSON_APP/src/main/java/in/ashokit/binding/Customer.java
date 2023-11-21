package in.ashokit.binding;

import lombok.Data;

@Data
public class Customer {
	
	private Integer id;
	private String name;
	private String email;
	private Integer phno;
	
	private Address address;
}
	
	