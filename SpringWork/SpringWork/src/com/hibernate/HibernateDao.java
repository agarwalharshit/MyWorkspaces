package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.sjsu.Employee;

public class HibernateDao {

	public static void main(String[] args) {
//	Configuration cfg=new Configuration();
//	cfg.configure("com/hibernate/hibernate.cfg.xml");
//	Session s=cfg.buildSessionFactory().openSession();
		
		Session s=new AnnotationConfiguration()  
		         .configure("com/hibernate/hibernate.cfg.xml").buildSessionFactory().openSession(); 
		
	Transaction t = s.beginTransaction();
	Employee1 e = new Employee1();
	e.setId(14);
	e.setName("Rahul");
	e.setAddress("jhhhs");
	s.persist(e);
	t.commit();
	s.close();

	}

}
