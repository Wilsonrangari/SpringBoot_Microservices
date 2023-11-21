package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		
		
		  //System.out.println(repository.getClass().getName());
		  
			/*
			 * Employee e1= new Employee(2, "Orlen", 5000.00, "Male", "Sales"); 
			 * Employee e2=
			 * new Employee(3, "Charles", 15000.00, "Male", "Admin"); 
			 * Employee e3= new
			 * Employee(4, "Smith", 25000.00, "Male", "Marketing");
			 * Employee e4= new
			 * Employee(5, "Cathy", 35000.00, "Fe-Male", "Account"); 
			 * Employee e5= new
			 * Employee(6, "Robert", 45000.00, "Male", "HR"); 
			 * Employee e6= new Employee(7,"David", 55000.00, "Male", "Manager");
			 * 
			 * repository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
			 * System.out.println("Record saved....");
			 */

			// Sort ascending = Sort.by("empName").ascending();

			/*
			 * Sort sort = Sort.by("empName").descending(); // List<Employee> findAll2 =
			 * repository.findAll(sort);
			 * 
			 * int pageNo=1;
			 * 
			 * PageRequest page = PageRequest.of(pageNo-1, 3); 
			 * Page<Employee> findAll = repository.findAll(page); 
			 * List<Employee> emps = findAll.getContent();
			 * 
			 * emps.forEach(System.out::println);
			 */

			/*
			 * Employee e = new Employee(); 
			 * e.setEmpGender("Male"); 
			 * e.setDept("Admin");
			 * 
			 * Example<Employee> of = Example.of(e); //it will check the data where gender is male only 
			 * List<Employee> emps = repository.findAll(of);
			 * emps.forEach(System.out::println);
			 */
		
		
		
		Employee emp = new Employee(); // emp.setEmpId(102); emp.setEmpName("Rani");
		emp.setDept("Admin");
		emp.setEmpGender("Fe-Male");

		repository.save(emp);
		 
		 
		
	}

}
