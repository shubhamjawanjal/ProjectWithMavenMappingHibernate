package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("Project Started......");
    	System.out.println("Creating Session object to get metadata of persistence object....");

    	/*
    	 Another way to create sessiofactory object
    	 
    	  SessionFactory factory = new Configuration().configure().buildSessionFactory();

    	  
    	*/ 

    	Configuration cfg = new Configuration();
    	cfg.configure();	 // sometimes we need to specify hibernate.cfg file name(cfg.configure(hibernate.cfg.xml))
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	// creating object of entity class to load data
    	
    	
    	Student student = new Student();
    	student.setsId(102);
    	student.setName("Narendra");
    	student.setCity("Wardha");
    	
    	Student student2 = new Student();
    	student2.setsId(103);
    	student2.setName("shubham");
    	student2.setCity("pune");
    	
		/*
		 * //session object is used to opens th connection with database Session session
		 * =factory.getCurrentSession(); //begins the transaction with database
		 * session.beginTransaction(); // saves the changes to database
		 * session.save(student); //need to close the transaction with database.
		 * session.getTransaction().commit(); // need to closae the datassbsee
		 * connection or session session.close();
		 */
    	// Creatin  object of address
    	Address address = new Address();
    	
    	address.setStreet("Street1");
    	address.setCity("pune");
    	address.setIsopen(true);
    	address.setAddedDate(new Date()); 
    	address.setX(122.22);
    	
    	Address address2 = new Address();
    	address2.setStreet("bhusari colony");
    	address2.setCity("kothrud");
    	address2.setIsopen(false);
    	address2.setAddedDate(new Date());
    	address.setX(12.36);
    	// Reading image    	
//    	FileInputStream fis = new FileInputStream("src/main/java/photo.jpg");
//    	byte[] data = new byte[fis.available()];
//    	fis.read(data);
//    	address.setImage(data);
    	Session session = factory.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(student);
    	session.save(student2);
    	
    	session.save(address);
    	session.save(address2);
    	tx.commit();
    	session.close();
    	System.out.println("Done");    	
    	System.out.println("*******to get data form database**********");   	
    }
}
