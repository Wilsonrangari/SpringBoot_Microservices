package in.ashokit.binding;

import java.io.Serializable;

import lombok.Data;


@Data

//redis wants serializabale object so just implements that
public class Country implements Serializable{
	
	private Integer sno;
	private String name;
	private String countryCode;
	

}
