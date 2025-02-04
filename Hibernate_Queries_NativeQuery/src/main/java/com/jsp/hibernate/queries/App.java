 package com.jsp.hibernate.queries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.jsp.hibernate.queries.entity.Actor;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Actor.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// Fetch Operation:- returntype List

//		        NativeQuery<Actor> nativeQuery=session.createNativeQuery("Select * from Actor",Actor.class);
//		        List<Actor> actorsList=nativeQuery.list();
//		        for(Actor actor:actorsList)
//		        {
//		        	System.out.println(actor);
//		        	System.out.println("Actor Name :- "+actor.getActorName());
//		        }

		
		
		
		
		// Update Operation :-returntype int
//		        NativeQuery<Actor> naQuery=session.createNativeQuery("UPDATE actor  SET actorAge=900 WHERE actorId=102");
//		        int rowUpadte=naQuery.executeUpdate();
//		        System.out.println("Row Upadte  "+rowUpadte);

		
		
		
		// Update Operation  Using Place holder:-
				        NativeQuery<Actor> nQuery=session.createNativeQuery("UPDATE Actor  SET actorAge=?1 WHERE actorId=:id");
				        nQuery.setParameter(1, 165);
				        nQuery.setParameter("id", 102);
				        int rowUpadte=nQuery.executeUpdate();
				        System.out.println("Row Upadte  "+rowUpadte);

		
		
		
		// Delete operation
//		Query<Actor> query = session.createQuery("DELETE Actor a WHERE a.actorId=103 ");
//		int rowDelete = query.executeUpdate();
//		System.out.println("Row Upadte  " + rowDelete);

		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
