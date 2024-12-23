package com.saini.service;

import java.util.List;

import com.saini.model.Bus;

public interface SainiService {

	public Bus addBus(Bus b);

	public Bus getBus(int id);

	public List<Bus> getAllBus();

	public Bus updateBus(Bus b);

	public List<Bus> deleteBus(int id);

}
