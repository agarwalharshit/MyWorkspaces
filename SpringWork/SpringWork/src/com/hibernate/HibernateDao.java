package com.hibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
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
//	Employee1 e = new Employee1();
//	e.setId(14);
//	e.setName("Rahul");
//	e.setAddress("jhhhs");
//	s.persist(e);
	
Team t1 = new Team();
//	t1.setTeamId(5);
//	t1.setTeamName("Sparten1s");
	Query q=s.createQuery("from Team");
	List<Team> list=q.list();
	Team t2=(Team)s.get(Team.class, new Integer(3));
	System.out.println(t2);	
	Session s2=new AnnotationConfiguration().configure("com/hibernate/hibernate.cfg.xml").buildSessionFactory().openSession();
	Team t3=(Team)s2.get(Team.class, new Integer(3));
	System.out.println(t3);
	
//	
//	
//	Player p1 = new Player();
//	p1.setId(9);
//	p1.setName("Harshit");
//	p1.setTeamId(5);
//	p1.setAge(27);
//	p1.setTeam(t1);
//	
//	
//	
//	
//	Player p2 = new Player();
//	p2.setId(10);
//	p2.setName("Anshul");
//	p2.setTeamId(5);
//	p2.setAge(26);
//	p2.setTeam(t1);
	

	
//	List<Player> hs= new ArrayList<Player>();
//	hs.add(p1);
//	hs.add(p2);
//	t1.setPlayers(hs);
//	s.save(p1);
//	s.save(p2);

	
	t.commit();
	s.close();

	}

}
