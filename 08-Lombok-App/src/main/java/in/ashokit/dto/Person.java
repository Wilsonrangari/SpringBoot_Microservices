package in.ashokit.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString*/

//or

@Data 
public class Person {
	
	private Integer personId;
	private String personName;
	private String gender;
	private Long phno;
	private Date dob;

}
