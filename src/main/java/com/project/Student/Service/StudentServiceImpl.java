package com.project.Student.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.Student.DAO.StudentDAO;
import com.project.Student.Entity.Student;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService{

	StudentDAO studentDAO;
	
	public StudentServiceImpl(StudentDAO studentDAO) {
		this.studentDAO=studentDAO;
	}
	@Override
	public List<Student> findall() {
		return studentDAO.findall();
		
	}

	@Override
	public Student findByID(int id) {
		return studentDAO.findByID(id);
		
	}

	@Override
	@Transactional
	public String deleteById(int id) {
		return studentDAO.deleteById(id);
		
	}

	@Override
	@Transactional
	public Student save(Student student) {
		return studentDAO.save(student);
		
	}

	@Override
	@Transactional
	public Student updateStudent(Student student) {
		return	studentDAO.updateStudent(student);
	
	}

}
