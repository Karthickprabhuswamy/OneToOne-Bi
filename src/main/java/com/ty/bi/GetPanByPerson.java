package com.ty.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPanByPerson
{
	public static void main(String[] args) 
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		
		Pan pan = entityManager.find(Pan.class,2);
		
		System.out.println(pan.getPanNumber());
		System.out.println(pan.getId());
		System.out.println(pan.getFatherName());
		System.out.println(pan.getPerson().getName());
		System.out.println(pan.getPerson().getAge());
		System.out.println(pan.getPerson().getId());
		
	}
	}

