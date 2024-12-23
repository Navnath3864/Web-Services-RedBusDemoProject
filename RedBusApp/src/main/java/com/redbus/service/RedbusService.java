package com.redbus.service;

import java.util.List;

import com.redbus.model.Bus;

public interface RedbusService {

	public void addBus(Bus b);

	public List<Bus> getAllBuses();

	public void addAllBuses(List<List<Bus>> listoflistofbus);

}
