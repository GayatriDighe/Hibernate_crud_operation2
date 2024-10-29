package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class InsertData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     cfg.addAnnotatedClass(Student.class);
	     
	     
	     SessionFactory sf = cfg.buildSessionFactory();
	     Session ss = sf.openSession();
	     Transaction tr = ss.beginTransaction();
	     
	     Student s = new Student();
	     

	     s.setF_name("Maria");
	     s.setL_name("Davis");
	     s.setDOB(2000-12-25);
	     s.setGender("female");
	     s.setAddress("202 Birch St, Springfield");
	     
	   
		ss.save(s);
//	     ss.persist(s);
	     System.out.println("data is inserted successfully");
	     tr.commit();
	     ss.close();

	}



		
	}


