package com.arasakumar.lakshmanan.configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SessionManager {
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("startingWithHibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}

}
