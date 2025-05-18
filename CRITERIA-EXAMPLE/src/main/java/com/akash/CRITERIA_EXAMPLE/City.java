package com.akash.CRITERIA_EXAMPLE;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int cid;
	String name;
	String dist;
	String State;
	String country;
	int pincode;
	
	public City() {
		super();
	}
	
	public City(String name, String dist, String state, String country, int pincode) {
		super();
		this.name = name;
		this.dist = dist;
		State = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "City [cid=" + cid + ", name=" + name + ", dist=" + dist + ", State=" + State + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	
}
