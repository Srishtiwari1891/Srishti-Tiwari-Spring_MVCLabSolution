package com.greatLearning.lab5.collegeFest.service;

import java.util.List;
import com.greatLearning.lab5.collegeFest.entity.Student;

public interface StudentService {

	void saveStudent(Student student);
	Student findStudentById(long id);
	List<Student> findAllStudent();
	void deleteStudent(long id);
}
