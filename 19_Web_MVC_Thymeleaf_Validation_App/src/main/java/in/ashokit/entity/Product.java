package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Product {
	
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	//@NotBlank(message="Name is mandatory")
	private String name;
	
	//@NotNull(message="Price is mandatory")
	private Double price;
	
	//@NotNull(message="Quantity is mandatory")
	private Integer qty;

}
