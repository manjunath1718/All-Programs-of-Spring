package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
