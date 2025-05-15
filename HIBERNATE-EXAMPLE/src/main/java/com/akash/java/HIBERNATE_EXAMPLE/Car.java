package com.akash.java.HIBERNATE_EXAMPLE;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
//import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity //to let know hibernate that mapping is provided in this class
@Table(name="car") //to map a class to a table in db
public class Car {
	@Id() //to mark a data member as primary key and it is mandatory provide primary key
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //to auto increment the primary key
	@Column(name="carid") //to map a data member to a column in table
	int carId;
//	@Embedded To embedd another object in an entity -> Containment->Composition
	@OneToOne(cascade = CascadeType.ALL) //use cascade to automatically insert an another transient entity before inserting this entity 
	Engine e;
	@Column(name="modelname")
	String modelName;
	@Column(name="price")
	float price;
	@Column(name="color")
	String color;
	
	public Car() {
		super();
	}
	
	public Car(int carId, String modelName, float price, String color) {
		super();
		this.carId = carId;
		this.modelName = modelName;
		this.price = price;
		this.color = color;
	}
	
	public Car(String modelName, float price, String color) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.color = color;
	}
	
	public Car(String modelName, float price, String color, Engine e) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.color = color;
		this.e = e;
	}
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", modelName=" + modelName + ", price=" + price + ", color=" + color + "]";
	}

	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
