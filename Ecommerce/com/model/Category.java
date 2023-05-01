package com.model;

import java.util.List;

public class Category {
	
	private long categoryID;
	private String title;
	private String description;
	private List<Product> products;
	
	public Category() {
		
	}

	public Category(long categoryID, String title, String description) {
		this.categoryID = categoryID;
		this.title = title;
		this.description = description;
	}

	public long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public boolean removeProduct(Product product) {
		return this.products.remove(product);
	}
	
	public Product findProduct(Product product) {
		if (this.products.contains(product))return product;
		else {
			System.out.println("The product is not under this category");
			return null;
		}
	}

}
