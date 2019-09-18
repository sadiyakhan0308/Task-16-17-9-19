package com.ssi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {

	@Id
	private String regno;
	private String Brand;
	private String model;
	private int Price;
	
	@ManyToOne
	private Emp emp;
	
	public Vehicle(String regno, String brand, String model, int price) {
		super();
		this.regno = regno;
		Brand = brand;
		this.model = model;
		Price = price;
	}
	public Vehicle(String regno) {
		super();
		this.regno = regno;
	}
	public Vehicle() {
		super();
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
	
	public Vehicle(String regno, String brand, String model, int price, Emp emp) {
		super();
		this.regno = regno;
		Brand = brand;
		this.model = model;
		Price = price;
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", Brand=" + Brand + ", model=" + model + ", Price=" + Price + "]";
	}
	
	
}