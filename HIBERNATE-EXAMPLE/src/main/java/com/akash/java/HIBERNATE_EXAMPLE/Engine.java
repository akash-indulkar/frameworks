package com.akash.java.HIBERNATE_EXAMPLE;

import jakarta.persistence.Column;
//import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Embeddable To mark a class as embeddable
@Entity
@Table(name="engine")
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="eid")
	int EId;
	@Column(name="type")
	String type;
	
	public Engine() {
		super();
	}
	public Engine(String type) {
		super();
		this.type = type;
	}
	
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Engine [EId=" + EId + ", type=" + type + "]";
	}
}
