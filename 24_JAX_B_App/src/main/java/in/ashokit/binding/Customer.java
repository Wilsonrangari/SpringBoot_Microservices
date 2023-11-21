package in.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Customer {
	
	private Integer Id;
	private String Name;
	private String Email;
	private Integer Phno;

}
