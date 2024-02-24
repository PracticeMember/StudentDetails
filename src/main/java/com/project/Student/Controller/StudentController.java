package com.project.Student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Student.DAO.StudentDAO;
import com.project.Student.Entity.Student;
import com.project.Student.Service.StudentService;
import com.project.Student.ServiceJpa.StudentServiceJPA;

@RestController
@RequestMapping("/college")
public class StudentController {
	
//	private StudentService student;
	private StudentServiceJPA student;
	
//	@Autowired
//	public StudentController(StudentService student) {
//		this.student=student;
//	}
	@Autowired
	public StudentController(StudentServiceJPA student) {
		this.student=student;
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		return student.findall();
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudentById(@PathVariable int studentId){
		return student.findByID(studentId);
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student studentdetails){
		return student.save(studentdetails);
	}
	@DeleteMapping("/students/{studentId}")
	public String deleteStudentById(@PathVariable int studentId) {
		return student.deleteById(studentId);
		
	}
	
	@PutMapping("/students")
	public Student UpdateStudent(@RequestBody Student studentdetails) {
		return student.save(studentdetails);
		
	}
	
	
}
