package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Performance;

import jakarta.transaction.Transactional;


@Repository

public interface Performancerepo extends JpaRepository<Performance, Integer> {
	
	@Transactional
    @Modifying
    @Query("DELETE FROM Performance p WHERE p.rating < 50")
    void deleteEmployeesWithRatingsLessThan50();
	
	 
}
