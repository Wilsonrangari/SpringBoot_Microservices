package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity //to make our java class as Entity class
@Table(name="emp_tbl") //to map our java class to table emp_table
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	
	@Id   //to make empId as primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)   ///it will take care of primary key--> for mySql db
	private String empName;
	private Double empSalary;
	private String empGender;
	private String dept;
	
	@CreationTimestamp
	@Column(name="date_created", updatable=false)  ///updatable=false value should not be updated even if i am updating the record
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name="last_updated", insertable=false)  //inseratble=false when the record is inserted this column value is not inserted only if the record is updated this column value should be updated
	private LocalDate lastUpdated;

}
