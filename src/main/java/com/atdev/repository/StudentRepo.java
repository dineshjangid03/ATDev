package com.atdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atdev.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
