package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class FetchData {
	
	public static void main(String[] args) {
			
	//get, load	
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	
	Session session = factory.openSession();
	Student student =session.get(Student.class, 102);
	System.out.println(student);
	
	Address ad=session.load(Address.class, 2);
	System.out.println(ad.getCity()+" : "+ad. getStreet());	
	factory.close();
	}
}