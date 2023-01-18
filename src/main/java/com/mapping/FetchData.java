package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Address;
import com.tut.Student;

public class FetchData {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Questions question =session.get(Questions.class, 1);
		Answer answer  =session.get(Answer.class, 343);
		
		
		System.out.println("question is :"+question.getQuestion()+" Answeer is :"+answer.getAnswer());
		
		
		
		factory.close();
		
		
	}

}
