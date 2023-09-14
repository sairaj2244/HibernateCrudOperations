package com.demo1.Sample1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

	public static void main(String[] args) {


		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setId(2);
		
		session.delete(s1);
		
		t.commit();
		session.close();
		
		System.out.println("Record Deleted");

	}

}
