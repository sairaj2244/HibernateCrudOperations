package com.demo1.Sample1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Student s1 = new Student();
    	s1.setId(4);
    	s1.setName("Siddhesh");
    	s1.setSalary(30000);
    	
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        session.save(s1);
        
        Transaction t = session.beginTransaction();
        t.commit();
        
        session.close();
        
        System.out.println("Object saved");
    	
    }
}
