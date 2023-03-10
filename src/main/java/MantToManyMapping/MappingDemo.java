package MantToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.seteId(34);
		e1.seteName("Ajinkya");
		
		e2.seteId(35);
		e2.seteName("Abhiu");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setpId(12121);
		p1.setProjectName("Bike garage Management");
		p2.setpId(12122);
		p2.setProjectName("ChatBot");
		
		List<Emp> list1 = new ArrayList();
		List<Project> list2 = new ArrayList();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmps(list1); 
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		
		tx.commit();
		session.close();
		factory.close();
		
		
	}

}
