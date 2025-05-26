package com.akash.SPRINGDATAJPA_EXAMPLE;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository // @Repository is a Spring Framework annotation used to indicate that the class is a Data Access Object (DAO)—a component that directly interacts with the database. 
public interface StudentRepositary extends JpaRepository<Student, Integer>{ //extends JpaRepository to inherit basic CRUD operations. Spring will handle the implementation automatically.
	
	public List<Student> findByName(String name); //which means Spring will automatically implement it based on its name.
	public List<Student> findByNameLike(String name);
	public List<Student> findBySidBetween(int a, int b);
	
	@Query(value = "select name from student where sid=?", nativeQuery = true) // @Query is used to define custom queries
	public String customQuery(int id);
}
