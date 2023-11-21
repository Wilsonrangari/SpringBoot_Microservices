package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Student;
import in.ashokit.entity.StudentEntity;
import in.ashokit.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public List<String> getCourses(){
		
		
		return Arrays.asList("JAVA", "Pyhton", "AWS");
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Morning","AfterNoon","Evening");
		
	}
	
	public boolean saveStudent(Student student) {
		
		System.out.println(student);
		StudentEntity entity= new StudentEntity();
		
		BeanUtils.copyProperties(student, entity);
		
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		System.out.println(entity);
		repo.save(entity);
		
		return true;
	}

}
