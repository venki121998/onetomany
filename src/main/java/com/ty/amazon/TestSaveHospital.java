package com.ty.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospital {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hospital hospital= new Hospital();
		hospital.setName("jaidev");
		hospital.setWeb("@jaidev");
		
		Branch branch = new Branch();
		branch.setName("bangalore");
		branch.setPhone(96547544);
		branch.setState("karnataka");
		branch.setCountry("India");
		
		Branch branch1 = new Branch();
		branch1.setName("bangalore");
		branch1.setPhone(96547544);
		branch1.setState("karnataka");
		branch1.setCountry("India");
		
		Branch branch2 = new Branch();
		branch2.setName("bangalore");
		branch2.setPhone(96547544);
		branch2.setState("karnataka");
		branch2.setCountry("India");
		branch.setHospital(hospital);
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		
		
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(hospital);
		entityTransaction.commit();
		
	}

}
