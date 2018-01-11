package com.hibernate.core.HibernateCore;

import org.hibernate.Session;

public class App {
	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Event theEvent = new Event();
		theEvent.setId(1);
		theEvent.setName("Hibernate");
		session.save(theEvent);
		Event event =session.load(Event.class,1);
		System.out.println(event.getName());
		session.getTransaction().commit();
	}
}
