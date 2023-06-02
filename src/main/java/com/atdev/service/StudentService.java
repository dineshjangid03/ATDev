package com.atdev.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.atdev.exception.StudentException;
import com.atdev.model.Student;

public interface StudentService {
	
	public Student insertStudent(@RequestBody Student student)throws StudentException;
	
	public List<Student> getAllStudent()throws StudentException;
	
	public Student getStudentById(Integer studentId)throws StudentException;
	
	public Student updateStudent(@RequestBody Student student)throws StudentException;
	
	public Student deleteStudent(Integer studentId)throws StudentException;

}
