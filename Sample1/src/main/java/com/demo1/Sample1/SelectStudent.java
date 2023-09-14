package com.demo1.Sample1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectStudent {

	public static void main(String[] args) {
		
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		
		Student s1 = new Student();
		
		s1 = session.get(Student.class, 1); // Autowiring
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getSalary());
		
		Student s2 = new Student();
		
		s2 = session.get(Student.class, 3); // Autowiring
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getSalary());
		
		t.commit();
		
		System.out.println("Data Recieved");
		
		
	}
	
}
