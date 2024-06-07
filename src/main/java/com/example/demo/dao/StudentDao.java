package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentDao {

	Student saveStudent(Student s, int section_id);

	boolean updateStudent(Student s);

	boolean deleteStudentByID(int id);

	Student getStudentByID(int id);

	List<Student> getAllStudentsByClass(int id, int year);

	List<Student> getAllStudentsByClassAndSection(int class_id, int section_id, int year);
}