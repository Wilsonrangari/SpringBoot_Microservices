package com.ait.client;

import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDaoImpl;
import com.ait.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDaoImpl(); 
		
		Student student = new Student();
		
		student.setSid(11011);
		student.setSname("Wilson");
		student.setGender("Male");
		student.setMarks(600);
		
		dao.saveStudent(student);
		
		

	}

}
