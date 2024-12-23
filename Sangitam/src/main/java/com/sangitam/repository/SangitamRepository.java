package com.sangitam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sangitam.model.Bus;
@Repository
public interface SangitamRepository extends JpaRepository<Bus, Integer> {
		
}
