package com.greatLearning.lab5.collegeFest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long studentID;

	@Column(name = "firstName", columnDefinition = "varchar(50)")
	private String firstName;

	@Column(name = "lastName", columnDefinition = "varchar(50)")
	private String lastName;

	@Column(name = "course", columnDefinition = "varchar(50)")
	private String course;

	@Column(name = "country", columnDefinition = "varchar(50)")
	private String country;

	public Student() {
		super();
	}


	public Student(String firstName, String lastName, String course, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}



	public long getStudentID() {
		return studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + ", course="
				+ course + ", country=" + country + "]";
	}

}
