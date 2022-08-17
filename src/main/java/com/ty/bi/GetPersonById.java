package com.ty.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonById {
	
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class, 2);
		
		System.out.println(person.getAge());
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getPan());
		System.out.println(person.getPan().getPanNumber());
		System.out.println(person.getPan().getId());
		System.out.println(person.getPan().getFatherName());
	}
		
	}


