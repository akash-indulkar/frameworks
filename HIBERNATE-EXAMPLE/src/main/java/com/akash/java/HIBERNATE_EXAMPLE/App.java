package com.akash.java.HIBERNATE_EXAMPLE;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Car obj = new Car("honda city", 392874983.3f, "white");
//        Car obj = new Car("honda city", 392874983.3f, "white", new Engine("Petrol"));
        Session session= new Configuration().configure("config.xml").buildSessionFactory().openSession();
        Transaction tx =  session.beginTransaction();
//        session.persist(obj); //insert query
        Car obj = session.getReference(Car.class, 1); //select query
        System.out.println(obj);
        session.remove(obj); //delete query
        tx.commit();
        session.close();
        
    }
}
