package com.sangitam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangitam.model.Bus;
import com.sangitam.service.SangitamService;
@RestController
public class SangitamController {
	@Autowired
	SangitamService sangitamService;

	@PostMapping("/addsangitambus")
	public Bus addBus(@RequestBody Bus b) {
		Bus bus = sangitamService.addBus(b);
		return bus;
	}
	
	@GetMapping("/getsinglesangitambus/{id}")
	public Bus getSingleBus(@PathVariable ("id") int id) {
		Bus bus = sangitamService.getBus(id);
		return bus;
	}
	
	@GetMapping("/getallsangitambus")
	public List<Bus> getAllBus() {
		List<Bus> bus = sangitamService.getAllBus();
		return bus;
	}
	
	@PutMapping("/updatesangitambus")
	public Bus updateBus(@RequestBody Bus b) {
		Bus bus = sangitamService.updateBus(b);
		return bus;
	}
	
	@DeleteMapping("/deletesangitambus/{id}")
	public List<Bus> deleteBus(@PathVariable ("id") int id) {
		List<Bus> buslist = sangitamService.deleteBus(id);
		return buslist;
	}
}
