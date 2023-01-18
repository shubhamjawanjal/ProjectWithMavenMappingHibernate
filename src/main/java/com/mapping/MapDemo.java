package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Questions  que1 = new Questions();
		que1.setQuestionId(1);
		que1.setQuestion("what is java");
	
		Answer ans = new Answer();
		ans.setAnswerId(343);
		ans.setAnswer("Java is programming language");
		
		que1.setAnswer(ans);
		
		Questions  que2 = new Questions();
		que2.setQuestionId(2);
		que2.setQuestion("what is Collection framework");
	
		Answer ans2 = new Answer();
		ans2.setAnswerId(344);
		ans2.setAnswer("API to work with objects in java");
		
		que2.setAnswer(ans2);
	
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		
		session.save(que1);
		session.save(que2);
		session.save(ans);
		session.save(ans2);
		
		
		tx.commit();
		session.close();
		
		factory.close();
		
	}
	
}
