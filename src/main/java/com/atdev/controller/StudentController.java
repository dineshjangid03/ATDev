package com.atdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atdev.exception.StudentException;
import com.atdev.model.Student;
import com.atdev.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/insert")
	public ResponseEntity<Student> insertStudent(@RequestBody @Valid Student student) throws StudentException{
		Student res=studentService.insertStudent(student);
		return new ResponseEntity<Student>(res, HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Student>> getAllStudent() throws StudentException{
		List<Student> res=studentService.getAllStudent();
		return new ResponseEntity<List<Student>>(res, HttpStatus.OK);
	}
	
	@GetMapping("/get/{studentId}")
	public ResponseEntity<Student> getStudentById(@PathVariable("studentId") Integer studentId) throws StudentException{
		Student res=studentService.getStudentById(studentId);
		return new ResponseEntity<Student>(res, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody @Valid Student student) throws StudentException{
		Student res=studentService.updateStudent(student);
		return new ResponseEntity<Student>(res, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("studentId") Integer studentId) throws StudentException{
		Student res=studentService.deleteStudent(studentId);
		return new ResponseEntity<Student>(res, HttpStatus.OK);
	}
	

}
