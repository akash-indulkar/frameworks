package com.akash.EMPLOYEE_MANAGEMENT;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
//@Table(name="salesofficer") //should not use @Table if  InheritanceType.SINGLE_TABLE
@Table(name="salesofficer")
//@DiscriminatorValue("S") //only used for strategy = InheritanceType.SINGLE_TABLE
public class SalesOfficer extends Employee {
//	@Id ////should not use @Id 
	float incentive;
	
	public SalesOfficer() {
		super();
	}
	
	public SalesOfficer(String name, float sal, float incentive) {
		super(name, sal);
		this.incentive = incentive;
	}
	
	public float getIncentive() {
		return incentive;
	}
	public void setIncentive(float incentive) {
		this.incentive = incentive;
	}
	@Override
	public String toString() {
		return "SalesOfficer [incentive=" + incentive + "]";
	}
	
	
}
