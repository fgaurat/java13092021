package com.m2i.tpjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory sessionFactory = Persistence.createEntityManagerFactory("com.m2i.tpjpa");

		EntityManager entityManager = sessionFactory.createEntityManager();
		entityManager.getTransaction().begin();

		Todo t = new Todo();
		t.setTitle("Une nouvelle Todo JPA");
		t.setUserId(10);
		t.setCompleted(true);
		entityManager.persist(t);

		/*
		 * List<Todo> result = entityManager.createQuery("from Todo",
		 * Todo.class).getResultList();
		 * 
		 * for (Todo todo : result) { System.out.println(todo); }
		 */
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
