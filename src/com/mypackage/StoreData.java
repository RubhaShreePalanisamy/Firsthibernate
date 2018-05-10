package com.mypackage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class StoreData {
public static void main(String[] args) {
	 Session session=new AnnotationConfiguration()  
	         .configure().buildSessionFactory().openSession();  
	      
	//Configuration cfg = new Configuration();
	//cfg.configure("hibernate.cfg.xml");
	
	//SessionFactory factory = cfg.buildSessionFactory();
	//Session session  = factory.openSession();
	Transaction t = session.beginTransaction();
	
	Employee e1 = new Employee();
	e1.setId(001);
	e1.setFirstName("frstname");
	e1.setLastName("lastname");
	Employee e2 = new Employee();
	e2.setId(101);
	e2.setFirstName("hello");
	e2.setLastName("kitty");
	
	session.persist(e1);
	
	session.persist(e2);
	
	t.commit();
	session.close();
	
	System.out.println("successfully saved");
	
	
}
}
