package com.redbus.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redbus.model.Bus;

@Repository
public interface RedbusRepository extends JpaRepository<Bus, Integer> {

}
