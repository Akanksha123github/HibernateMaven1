package com.h1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectOrRetrive {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("From Student");
		List<Student> list = query.list();
		
		for(Student student:list) {
			System.out.println("Id >>"+student.getId());
			System.out.println("Name >>"+student.getName());
			System.out.println("City >> "+student.getCity());
			System.out.println("MobilNo >> "+student.getMobile());
			
		}
		session.close();
		sessionFactory.close();
		System.out.println("Retrive Data Successfully");

	}

}
