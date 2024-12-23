package com.saini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.saini.model.Bus;
@Repository
public interface SainiRepository extends JpaRepository<Bus, Integer> {
		
}
