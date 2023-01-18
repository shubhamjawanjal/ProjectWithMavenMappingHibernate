package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		
		Student student = new Student();
		
		student.setsId(104);
		student.setName("shubham jawanjal");
		student.setCity("Malkapur");
		
		Certification certification = new Certification();
		certification.setCourse("java");
		certification.setDuration("1.5 Month");
		student.setCertificate(certification);
		
		Student student1 = new Student();
		
		student1.setsId(105);
		student1.setName("Vrushabh");
		student1.setCity("Amravti");
	
		Certification certification1 = new Certification();
		certification1.setCourse("Hbernate");
		certification1.setDuration("1.20 Month");
		student1.setCertificate(certification1);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(student);
		s.save(student1);
		
		tx.commit();
		factory.close();
		s.close();
	}

}
