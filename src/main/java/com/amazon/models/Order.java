package com.amazon.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	private String productname;
	private String date;
	private String status;
	private int count;
	public Order() {
		
	}
	public Order(int order_id, User user, Product product, String productname, String date, String status, int count) {
		this.order_id = order_id;
		this.user = user;
		this.product = product;
		this.productname = productname;
		this.date = date;
		this.status = status;
		this.count = count;
	}
	

	public Order(User user, Product product, String productname, String date, String status, int count) {

		this.user = user;
		this.product = product;
		this.productname = productname;
		this.date = date;
		this.status = status;
		this.count = count;
	}


	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
