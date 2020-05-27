package com.frids.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frids.shopping.model.Shopping;

@Repository
public interface ShoppingRepository extends JpaRepository<Shopping, Integer>{
	
}
