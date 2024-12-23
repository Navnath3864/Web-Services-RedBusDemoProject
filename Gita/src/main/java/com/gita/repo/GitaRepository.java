package com.gita.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gita.model.Bus;
@Repository
public interface GitaRepository extends JpaRepository<Bus, Integer> {

}
