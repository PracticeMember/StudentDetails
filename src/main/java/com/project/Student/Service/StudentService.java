package com.project.Student.Service;

import java.util.List;

import com.project.Student.Entity.Student;

public interface StudentService {
	
	List<Student> findall();
	
	Student findByID(int id);
	

	
	String deleteById(int id);
	
	Student save(Student student);
	
	Student updateStudent(Student student);
}
