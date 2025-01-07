package com.course.practicaljava.entity;

public class Tire {
  private String manufacturer;
  private  int price;
  private int size;
public Tire() {
	super();
}
public Tire(String manufacturer, int size, int price) {
	super();
	this.manufacturer = manufacturer;
	this.size = size;
	this.price = price;
}
public String getManufacturer() {
	return manufacturer;
}
public int getPrice() {
	return price;
}
public int getSize() {
	return size;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public void setPrice(int price) {
	this.price = price;
}
public void setSize(int size) {
	this.size = size;
}
  
}
