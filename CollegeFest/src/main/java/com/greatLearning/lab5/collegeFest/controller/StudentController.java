package com.greatLearning.lab5.collegeFest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatLearning.lab5.collegeFest.entity.Student;
import com.greatLearning.lab5.collegeFest.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@GetMapping(value = "/showForm")
	public String listStudents(Model themodel) {
		List<Student> studentlist = studentservice.findAllStudent();
		themodel.addAttribute("students", studentlist);
		return "list-student";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("mode", "Add");
		return "student-form";
	}

	@GetMapping(value = "/showFormForUpdate")
	public String showFormForUpdate(Model model, @RequestParam("studentId") long studentId) {
		Student student = studentservice.findStudentById(studentId);
		model.addAttribute("student", student);
		model.addAttribute("mode", "Update");
		return "student-form";
	}

	@PostMapping("/save")
	public String saveStudent(@RequestParam("studentID") long studentId, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("course") String course,
			@RequestParam("country") String country) {
		Student student = null;
		if (studentId == 0) {
			student = new Student(firstName, lastName, course, country);
		} else {
			student = studentservice.findStudentById(studentId);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setCourse(course);
			student.setCountry(country);
		}
		studentservice.saveStudent(student);
		return "redirect:showForm";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") long studentId) {
		studentservice.deleteStudent(studentId);
		return "redirect:showForm";
	}

}
