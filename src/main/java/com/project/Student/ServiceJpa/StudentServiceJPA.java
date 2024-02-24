package com.project.Student.ServiceJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.Student.Entity.Student;
import com.project.Student.Repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceJPA {

	StudentRepository studentrep;
	
	public StudentServiceJPA(StudentRepository studentrep) {
		this.studentrep=studentrep;
	}
	
	
	public List<Student> findall() {
		return studentrep.findAll();
		
	}

	public Student findByID(int id) {
		Optional<Student>student=studentrep.findById(id);
		Student studentval=null;
		if(student.isPresent())
			studentval= student.get();
		else {
			throw new RuntimeException("Couldn't find employee with "+id);
		}
		return studentval;
		
		
	}


	public String deleteById(int id) {
		studentrep.deleteById(id);
		return "Student deleted with id "+id;
		
	}

	public Student save(Student student) {
		return studentrep.save(student);
		
	}
	
	
}
