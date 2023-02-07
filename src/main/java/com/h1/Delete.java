package com.h1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Delete {
	
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	    SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = (Student) session.get(Student.class, 3);
		session.delete(student);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Deleted successfully");

	}


}
