package com.m2i.tpjpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		// HQL : Hibernate Query Language
		List<Todo> result = session.createQuery("from Todo where completed=false").list();
		result.forEach(System.out::println);

//		Todo t = new Todo();
//		t.setTitle("Une nouvelle Todo");
//		t.setUserId(10);
//		t.setCompleted(false);

//		session.save(t);
//		session.getTransaction().commit();
//		session.close();

	}

}
