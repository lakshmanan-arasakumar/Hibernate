package com.arasakumar.lakshmanan.test;


import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.arasakumar.lakshmanan.model.Book;
import com.arasakumar.lakshmanan.model.Publisher;


public class StartingWithHibernateTest {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("startingWithHibernate");
	EntityManager em = emf.createEntityManager();
	
	@BeforeMethod
	public void setup() {
		
	}
	
	@Test
	public void testCreateObjectGraph() {
		
		em.getTransaction().begin();
		
		Publisher publisher = new Publisher();
		publisher.setName("Uyirmmai");
		publisher.setCode("UYMI");
		publisher.setAddress("Chennai");
		
		Book book = new Book();
		book.setName("Kavithai book");
		book.setIsbn("asfjslaf123123");
		book.setPrice(new BigDecimal(100));
		book.setPublisher(publisher);
		
		em.persist(book);
		
		System.out.print(true);
		
	}

}
