package com.redbus.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.redbus.model.Bus;
import com.redbus.service.RedbusService;

@RestController
public class RedbusController {

	@Autowired
	RestTemplate rs;

	@Autowired
	RedbusService redbusService;

	List<List<Bus>> listoflistofbus = new ArrayList<>();

	@GetMapping("/getallbuses")
	public List<List<Bus>> getAllProducerBuses() {

		List<List<Bus>> listOfListOfBus = new ArrayList<>();

		Bus[] sangitamBusList = rs.getForObject("http://localhost:8081/getallsangitambus", Bus[].class);
		List<Bus> al1 = new ArrayList<Bus>(Arrays.asList(sangitamBusList));
		if (al1 != null) {
			listOfListOfBus.add(al1);
		}

		Bus[] gitaBusList = rs.getForObject("http://localhost:8082/getallgitabus", Bus[].class);
		List<Bus> al2 = new ArrayList<>(Arrays.asList(gitaBusList));
		if (al2 != null) {
			listOfListOfBus.add(al2);
		}

		Bus[] sainiBusList = rs.getForObject("http://localhost:8084/getallsainibus", Bus[].class);
		List<Bus> al3 = new ArrayList<>(Arrays.asList(sainiBusList));
		System.out.println(al3);
		if (al3 != null) {
			listOfListOfBus.add(al3);
		}

		redbusService.addAllBuses(listOfListOfBus);

		return listOfListOfBus;

	}

	@GetMapping("/getbusformto/{fromLocation}/{toLocation}")
	public List<Bus> getBusByFromLocationAndToLocation(@PathVariable("fromLocation") String fromLocation,
			@PathVariable("toLocation") String toLocation) {
		System.out.println(fromLocation + " " + toLocation);
		List<Bus> busList = redbusService.getAllBuses();
		System.out.println(busList);
		List<Bus> list = new ArrayList<Bus>();

		for (Bus b : busList) {
			System.out.println(b);
			if (b.getFromLocation().equals(fromLocation) && b.getToLocation().equals(toLocation)) {
				list.add(b);
			}
		}
		return list;
	}

	@GetMapping("/getbusdateandtime/{fromLocation}/{toLocation}")
	public List<Bus> getBusByDateAndTimeAndFromLocationAndToLocation(@PathVariable("fromLocation") String fromLocation,
			@PathVariable("toLocation") String toLocation) {
		List<Bus> busList = redbusService.getAllBuses();
		List<Bus> list = new ArrayList<Bus>();

		for (Bus b : busList) {
			if (b.getFromLocation().equals(fromLocation) && b.getToLocation().equals(toLocation)) {
				list.add(b);
			}
		}
		list.sort(Comparator.comparingInt(Bus::getDate));
		return list;
	}

	@GetMapping("/getbusbyticket")
	public List<Bus> getBusByTicket() {
		List<Bus> busList = redbusService.getAllBuses();
		busList.sort(Comparator.comparingDouble(Bus::getTicket));
		return busList;
	}
}
