package com.saini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saini.model.Bus;
import com.saini.service.SainiService;
@RestController
public class SainiController {
	@Autowired
	SainiService sainiService;

	@PostMapping("/addsainibus")
	public Bus addBus(@RequestBody Bus b) {
		Bus bus = sainiService.addBus(b);
		return bus;
	}
	
	@GetMapping("/getsinglesainibus/{id}")
	public Bus getSingleBus(@PathVariable ("id") int id) {
		Bus bus = sainiService.getBus(id);
		return bus;
	}
	
	@GetMapping("/getallsainibus")
	public List<Bus> getAllBus() {
		List<Bus> bus = sainiService.getAllBus();
		return bus;
	}
	
	@PutMapping("/updatesainibus")
	public Bus updateBus(@RequestBody Bus b) {
		Bus bus = sainiService.updateBus(b);
		return bus;
	}
	
	@DeleteMapping("/deletesainibus/{id}")
	public List<Bus> deleteBus(@PathVariable ("id") int id) {
		List<Bus> buslist = sainiService.deleteBus(id);
		return buslist;
	}
}
