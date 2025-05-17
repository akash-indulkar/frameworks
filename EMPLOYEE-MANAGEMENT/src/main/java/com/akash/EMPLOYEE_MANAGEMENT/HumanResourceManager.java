package com.akash.EMPLOYEE_MANAGEMENT;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "humanresourcemanager") ////should not use @Table if  InheritanceType.SINGLE_TABLE
@Table(name = "humanresourcemanager")
//@DiscriminatorValue("HR") //only used for strategy = InheritanceType.SINGLE_TABLE
public class HumanResourceManager extends Employee{
//	@Id ////should not use @Id 

	float allowance;

	public HumanResourceManager() {
		super();
	}
	
	public HumanResourceManager(String name, float sal, float allowance) {
		super(name, sal);
		this.allowance = allowance;
	}

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "HumanResourceManager ['allowance=" + allowance + "]";
	}
	
}
