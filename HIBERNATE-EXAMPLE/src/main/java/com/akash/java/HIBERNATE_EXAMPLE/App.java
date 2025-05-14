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
        Car obj = new Car("honda city", 392874983.3f, "white");
        Configuration cfg = new Configuration();
        cfg.configure("config.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();
        session.persist(obj);
        tx.commit();
        session.close();
        
    }
}
