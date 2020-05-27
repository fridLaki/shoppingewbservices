package com.frids.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frids.shopping.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
