package com.project.Student.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Student.Entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{

	
	private EntityManager entityManager;
	
	@Autowired
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}
	
	@Override
	public List<Student> findall() {
		TypedQuery<Student> query=entityManager.createQuery("from Student",Student.class);	
		List<Student> students=query.getResultList();
		System.out.println(students);
		return students;
	}

	@Override
	public Student findByID(int id) {
		Student student=entityManager.find(Student.class, id);
		return student;
	}

	@Override

	public String deleteById(int id) {
		Student studentdet=entityManager.find(Student.class, id);
		entityManager.remove(studentdet);
		return "Student is deleted with id "+id;
	}

	@Override

	public Student save(Student student) {
		Student studentRes =entityManager.merge(student);
		
		return studentRes;
	}

	@Override

	public Student updateStudent(Student student) {
		Student studentRes =entityManager.merge(student);
		
		return studentRes;
	}
	
	

}
