package com.sjsu;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateConn {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		//AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/sjsu/hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t = s.beginTransaction();
		employee e = new employee();
		e.setEmpid(2);
		e.setName("Harshit");
		e.setDepartment("SE");
		Customer c= new Customer();
		c.setCid(1);
		c.setCname("Ram");
		Set l = new HashSet();
		l.add("c");
		e.setCustomer(l);
		s.save(e);
		t.commit();
		s.close();
		
		
	}

}
