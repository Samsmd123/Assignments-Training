package com.cosmetics.model;

import lombok.Getter;
import lombok.Setter;

public class Cosmetics {
	@Getter
	@Setter
	private int comesticsId;
	private String name;
	private String brand;
	private  String category;
	private double price;
	
	public Cosmetics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cosmetics(int comesticsId, String name, String brand, String category, double price) {
		super();
		this.comesticsId = comesticsId;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}

	public int getComesticsId() {
		return comesticsId;
	}

	public void setComesticsId(int comesticsId) {
		this.comesticsId = comesticsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cosmetics [comesticsId=" + comesticsId + ", name=" + name + ", brand=" + brand + ", category="
				+ category + ", price=" + price + "]";
	}

}
