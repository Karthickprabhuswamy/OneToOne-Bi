package com.ty.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	
	
	public static void main(String[] args) 
	{
	
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person =  new Person();
		person.setName("Tiger-manja");
		person.setAge(24);
			
		Pan pan = new Pan();
		pan.setPanNumber(4539815);
		pan.setFatherName("Lion-kunja");
		
	
		
		person.setPan(pan);
		pan.setPerson(person);
		
		
		
		entityTransaction.begin();
		
		entityManager.persist(person);
		entityManager.persist(pan);
		
		
		
		entityTransaction.commit();
		
		System.out.println("-----Data Saved-------");
		
	
		
	}

}
