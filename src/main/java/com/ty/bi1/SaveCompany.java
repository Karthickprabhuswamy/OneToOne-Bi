package com.ty.bi1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCompany {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();

		company.setName("JSW");
		company.setPhone(9844578124l);

		GST gst = new GST();

		gst.setGstNo("GSTIN4721LL");
		gst.setStatus("Active");

		gst.setCompany(company);
		company.setGst(gst);

		entityTransaction.begin();

		entityManager.persist(company);
		entityManager.persist(gst);

		entityTransaction.commit();

		System.out.println("-----Data Stored----------");

	}

}
