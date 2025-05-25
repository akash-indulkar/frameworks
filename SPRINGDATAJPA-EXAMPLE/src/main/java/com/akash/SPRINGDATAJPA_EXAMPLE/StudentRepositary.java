package com.akash.SPRINGDATAJPA_EXAMPLE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // @Repository is a Spring Framework annotation used to indicate that the class is a Data Access Object (DAO)—a component that directly interacts with the database. 
public interface StudentRepositary extends JpaRepository<Student, Integer>{ //extends JpaRepository to inherit basic CRUD operations. Spring will handle the implementation automatically.
	
}
