package com.demo1.Sample1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main (String[] args) {
		
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Ritesh");
		s1.setSalary(10000);
		
		session.merge(s1);
		
		t.commit();
		session.close();
		
		System.out.println("Record Updated");
		
	}
	
}
