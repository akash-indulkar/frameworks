package com.akash.SPRINGDATAJPA_EXAMPLE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // marks our class as spring managed repository , must extend JpaRepositary to use Spring data JPA features
public interface StudentRepositary extends JpaRepository<Student, Integer>{
	
}
