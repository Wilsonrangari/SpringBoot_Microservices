package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data

@Table(name="student_Enq")
public class StudentEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sId;
	private String name;
	private String email;
	private String gender;
	private String course;
	

}
