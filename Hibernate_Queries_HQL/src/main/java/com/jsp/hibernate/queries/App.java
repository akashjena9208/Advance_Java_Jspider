package com.jsp.hibernate.queries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jsp.hibernate.queries.entity.Actor;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Actor.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// Fetch Operation:- returntype List

		//        Query<Actor> query=session.createQuery("Select a from Actor a");
		//        List<Actor> actorsList=query.list();
		//        for(Actor actor:actorsList)
		//        {
		//        	System.out.println(actor);
		//        	System.out.println("Actor Name :- "+actor.getActorName());
		//        }

		
		
		
		
		// Update Operation :-returntype int
		//        Query<Actor> query=session.createQuery("UPDATE Actor a SET a.actorAge=100 WHERE a.actorId=101 ");
		//        int rowUpadte=query.executeUpdate();
		//        System.out.println("Row Upadte  "+rowUpadte);

		
		
		
		// Update Operation  Using Place holder:-
				        Query<Actor> query=session.createQuery("UPDATE Actor a SET a.actorAge=?1 WHERE a.actorId=:id");
				        query.setParameter(1, 65);
				        query.setParameter("id", 101);
				        int rowUpadte=query.executeUpdate();
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
