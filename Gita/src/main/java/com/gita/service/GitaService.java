package com.gita.service;

import java.util.List;

import com.gita.model.Bus;

public interface GitaService {

	public Bus addBus(Bus b);

	public Bus getBus(int id);

	public List<Bus> getAllBus();

	public Bus updateBus(Bus b);

	public List<Bus> deleteBus(int id);

}
