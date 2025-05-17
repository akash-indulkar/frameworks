package com.akash.EMPLOYEE_MANAGEMENT;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //used when you have class inheritance in your Java entities. //SINGLE_TABLE 1 table per hierarchy 
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //used when you have class inheritance in your Java entities. //TABLE_PER_CLASS One per concrete class
@Inheritance(strategy = InheritanceType.JOINED) //used when you have class inheritance in your Java entities. //JOINED	table per subclass
//@DiscriminatorColumn(name="emptype") // Defines the column used to distinguish between different entity types in a single table. //only used for strategy = InheritanceType.SINGLE_TABLE
//@DiscriminatorValue("E") //Defines the value stored in that column for a particular entity type. //only used for strategy = InheritanceType.SINGLE_TABLE
public class Employee {
	@Id //Id should be defined only in the base class, and all subclasses inherit it.
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int Eid;
	String name;
	float sal;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, float sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}
