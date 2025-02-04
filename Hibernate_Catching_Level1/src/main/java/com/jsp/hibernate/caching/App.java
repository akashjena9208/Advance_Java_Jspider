 package com.jsp.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration configuration=new Configuration().configure().addAnnotatedClass(Mobile.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		
		//Session :-1
		Session session1=sessionFactory.openSession();
		Transaction transaction=session1.beginTransaction();
		
		
		Mobile mobile1=session1.get(Mobile.class, 101);
		System.out.println(mobile1);
		
		

		Mobile mobile2=session1.get(Mobile.class, 101);
		System.out.println(mobile2);
		
		transaction.commit();
		session1.close();
		
		System.out.println();
		
		
		//Session :-2
				Session session2=sessionFactory.openSession();
				Transaction transaction1=session2.beginTransaction();
				
				
				Mobile mobile4=session2.get(Mobile.class, 101);
				System.out.println(mobile4);
				
				

				Mobile mobile3=session2.get(Mobile.class, 101);
				System.out.println(mobile3);
				
				transaction1.commit();
				session2.close();
		
		
		

		
		
		
				
		
	}

}
