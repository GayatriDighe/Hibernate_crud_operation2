package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class DeleteData {

	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
	    cfg.addAnnotatedClass(Student.class);
	    
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session ss = sf.openSession();
	    Transaction tr = ss.beginTransaction();
	    

	    int stud_id=3;
	    Student s=ss.get(Student.class,stud_id);
	    //ss.remove(s);
	    ss.delete(s);
	    
	    System.out.println("data is inserted successfully");
	    tr.commit();
	    ss.close();
	    
	}
	

	}


