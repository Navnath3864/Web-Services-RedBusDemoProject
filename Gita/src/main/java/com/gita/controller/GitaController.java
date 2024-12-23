package com.gita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gita.model.Bus;
import com.gita.service.GitaService;



@RestController
public class GitaController {
	@Autowired
	GitaService gitaService;
	
	@PostMapping("/addgitabus")
	public Bus addBus(@RequestBody Bus b) {
		Bus bus = gitaService.addBus(b);
		return bus;
	}
	
	@GetMapping("/getsinglegitabus/{id}")
	public Bus getSingleBus(@PathVariable ("id") int id) {
		Bus bus = gitaService.getBus(id);
		return bus;
	}
	
	@GetMapping("/getallgitabus")
	public List<Bus> getAllBus() {
		List<Bus> bus = gitaService.getAllBus();
		return bus;
	}
	
	@PutMapping("/updategitabus")
	public Bus updateBus(@RequestBody Bus b) {
		Bus bus = gitaService.updateBus(b);
		return bus;
	}
	
	@DeleteMapping("/deletegitabus/{id}")
	public List<Bus> deleteBus(@PathVariable ("id") int id) {
		List<Bus> buslist = gitaService.deleteBus(id);
		return buslist;
	}

}
