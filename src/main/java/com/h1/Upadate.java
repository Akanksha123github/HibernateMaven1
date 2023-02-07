package com.h1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Upadate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		 Student student1 = (Student) session.get(Student.class,2);
		 
		 student1.setName("Akki");
		 //To update in Table
		 session.update(student1);
		 transaction.commit();
		 
		 session.close();
		 System.out.println("Update successfully");

	}

}
