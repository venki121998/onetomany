package com.ty.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetAmazonOrder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Items items= entityManager.find(Items.class, 1);
		
			if(items !=null){
				System.out.println(items.getName());
				System.out.println(items.getPrice());
			}
			else
			{
				System.out.println("item not found");
			}
			

	}
	}
