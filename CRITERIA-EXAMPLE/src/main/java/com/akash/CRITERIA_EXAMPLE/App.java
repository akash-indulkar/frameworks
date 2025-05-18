package com.akash.CRITERIA_EXAMPLE;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class App 
{
    public static void main( String[] args )
    {
//    	City c1 = new City("Karad", "Satara", "Maharashtra", "India", 415110);
//    	City c2 = new City("Patan", "Satara", "Maharashtra", "India", 415104);
//    	City c3 = new City("Worli", "Mumbai", "Maharashtra", "India", 415101);
//    	City c4 = new City("Nigadi", "Pune", "Maharashtra", "India", 414084);
//    	City c5 = new City("Islamapur", "Sangli", "Maharashtra", "India", 417519);
    	Session session = new Configuration().configure().buildSessionFactory().openSession();
    	Transaction tx = session.beginTransaction();
    	//JPA code
    	CriteriaBuilder builder = session.getCriteriaBuilder(); //used to build Criteria query
//    	CriteriaQuery<City> jpaQuery = builder.createQuery(City.class); //actual creation of structure of query
    	CriteriaQuery<Object[]> jpaQuery = builder.createQuery(Object[].class);
    	Root<City> base = jpaQuery.from(City.class);
    	
    	// select * from city
//    	jpaQuery.select(base); //it modifies criteria query, choosing which fields to return
    	
    	//select * from city where pincode = 415110
//    	jpaQuery.select(base).where(builder.equal(base.get("pincode"), 415110));
    	
    	//select city.name, city.pincode from city
    	jpaQuery.multiselect(base.get("name"), base.get("pincode"));
//    	session.persist(c1);
//    	session.persist(c2);
//    	session.persist(c3);
//    	session.persist(c4);
//    	session.persist(c5);

    	
    	//Hibernate Code
    	Query<Object[]> ormQuery = session.createQuery(jpaQuery); //converting into actual executable hibernate query which can run on DB
    	List<Object[]> cities = ormQuery.getResultList(); //actual execution of query
    	for(Object[] c : cities) {
    		System.out.println(c[0] + " " + c[1]);
    	}
    	tx.commit();
    	session.close();
    }
}
