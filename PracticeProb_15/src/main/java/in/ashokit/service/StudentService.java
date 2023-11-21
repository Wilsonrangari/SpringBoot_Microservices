package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.StudentBinding;
import in.ashokit.entity.StudentEntity;
import in.ashokit.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	
public boolean saveStudent(StudentBinding student) {
		
		System.out.println(student);
		StudentEntity entityObj= new StudentEntity();
		
		BeanUtils.copyProperties(student, entityObj);
		
		
		System.out.println(entityObj);
		repo.save(entityObj);
		
		return true;
	}


}
