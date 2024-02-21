package com.project.Student.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.Student.Entity.Student;


public interface StudentDAO {

	List<Student> findall();
	
	Student findByID(int id);
	

	String deleteById(int id);
	
	Student save(Student student);
	
	Student updateStudent(Student student);
}
