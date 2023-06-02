package com.atdev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atdev.exception.StudentException;
import com.atdev.model.Student;
import com.atdev.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student insertStudent(Student student) throws StudentException {
		
		if(student.getAge()==null)
			throw new StudentException("age cannot be null");
		
		if(student.getStudentName()==null)
			throw new StudentException("name cannot be null");
		
		if(student.getMobileNo()==null)
			throw new StudentException("mobile no. cannot be null");
		
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student>res=studentRepo.findAll();
		
		if(res.isEmpty())
			throw new StudentException("list is empty");
		
		return res;
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentException {
		Student res=studentRepo.findById(studentId)
				.orElseThrow(()->new StudentException("Student not found with id "+studentId));
		
		return res;
	}

	@Override
	public Student updateStudent(Student student) throws StudentException {
		Student savedStudent=studentRepo.findById(student.getStudentId())
				.orElseThrow(()->new StudentException("Student not found with id "+student.getStudentId()));
		
		if(student.getAge()!=null)
			savedStudent.setAge(student.getAge());
		
		if(student.getMobileNo()!=null)
			savedStudent.setMobileNo(student.getMobileNo());
		
		if(student.getStudentName()!=null)
			savedStudent.setStudentName(student.getStudentName());
		
		return studentRepo.save(savedStudent);
	}

	@Override
	public Student deleteStudent(Integer studentId) throws StudentException {
		Student res=studentRepo.findById(studentId)
				.orElseThrow(()->new StudentException("Student not found with id "+studentId));
		
		studentRepo.delete(res);
		
		return res;
	}

}
