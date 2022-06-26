package com.greatLearning.lab5.collegeFest.service;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatLearning.lab5.collegeFest.entity.Student;

@Repository
public class StudentServiceImpl implements StudentService {
	
	private SessionFactory sessionfactory;
	private Session session;
	
	@Autowired
	public StudentServiceImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
		try {
		this.session=this.sessionfactory.getCurrentSession();
		}catch(HibernateException e) {
			this.session = this.sessionfactory.openSession();
		}
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		Transaction transaction=this.session.beginTransaction();
		this.session.saveOrUpdate(student);
		transaction.commit();
	}

	@Override
	public Student findStudentById(long id) {
		// TODO Auto-generated method stub
		Student student=this.session.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		List<Student> students=this.session.createQuery("from Student").list();
		return students;
	}

	@Override
	@Transactional
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		Student student = findStudentById(id);
		Transaction transaction = this.session.beginTransaction();
		session.delete(student);
		transaction.commit();
	}

}
