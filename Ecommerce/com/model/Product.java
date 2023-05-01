package com.model;

public class Product {
	
	
	private String serialNumber;
	private String title;
	private String description;
	private Category category;
	private float price;
	private int stock;
	private String expDate;
	
	
	public Product() {
	
	}


	public Product(String serialNumber, String title, String description, Category category, float price, int stock,
			String expDate) {
		this.serialNumber = serialNumber;
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.expDate = expDate;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getExpDate() {
		return expDate;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	

}
