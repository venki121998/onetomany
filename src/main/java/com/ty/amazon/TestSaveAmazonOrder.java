package com.ty.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAmazonOrder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
 Items items = new Items();
 items.setName("tables ordering");
 items.setPrice(45000);
 items.setQuantity(5);
 Items items1 = new Items();
 items1.setName("chairs ordering");
 items1.setPrice(45000);
 items1.setQuantity(5);
 Items items2 = new Items();
 items2.setName("laptop ordering");
 items2.setPrice(45000);
 items2.setQuantity(5);
 
 Amazon_order amazon_order= new Amazon_order();
 amazon_order.setAddress("raj nagar");
 amazon_order.setName("office work");
 amazon_order.setStatus("packing");
 items.setOrder(amazon_order);
 items1.setOrder(amazon_order);
 items2.setOrder(amazon_order);
 entityTransaction.begin();
 entityManager.persist(amazon_order);
 entityManager.persist(items);
 entityManager.persist(items1);
 entityManager.persist(items2);
 entityTransaction.commit();
 
 
	}

}
