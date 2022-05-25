package com.ty.amazon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Items {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Amazon_order getOrder() {
	return amazon_order;
}
public void setOrder(Amazon_order order) {
	this.amazon_order = amazon_order;
}
private String name;
private double price;
private int quantity;
@ManyToOne
private Amazon_order amazon_order;

}
