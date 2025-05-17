package com.akash.EMPLOYEE_MANAGEMENT;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SalesOfficer so = new SalesOfficer("akash", 11000f, 12987.5f);
    	HumanResourceManager hr = new HumanResourceManager("pradnya", 15000f, 3000f);
    	Employee emp= new Employee("Karan", 50000f);
    	
    	Session session = new Configuration().configure().buildSessionFactory().openSession();
    	Transaction tx = session.beginTransaction();
    	session.persist(so);
    	session.persist(hr);
    	session.persist(emp);
    	tx.commit();
    	session.close();
    }
}
