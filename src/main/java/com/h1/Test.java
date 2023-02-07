package com.h1;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		 
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		org.hibernate.Transaction transaction = session.beginTransaction();
		
		Student student = new Student();
		student.setName("Ajinkya");
		student.setCity("Sangli");
		student.setMobile("9595972678");
		

		Student student2 = new Student();
		student2.setName("Akhilesh");
		student2.setCity("belguam");
		student2.setMobile("9587346878");
		
		Student student3= new Student();
		student3.setName("Akash");
		student3.setCity("pune");
		student3.setMobile("998437588");
		
		
		session.save(student);
		session.save(student2);
		session.save(student3);
		transaction.commit();
		session.close();
		System.out.println("Record saved successfully.");

	}


	}


