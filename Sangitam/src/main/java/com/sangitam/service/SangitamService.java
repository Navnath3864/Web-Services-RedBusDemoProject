package com.sangitam.service;

import java.util.List;

import com.sangitam.model.Bus;

public interface SangitamService {

	public Bus addBus(Bus b);

	public Bus getBus(int id);

	public List<Bus> getAllBus();

	public Bus updateBus(Bus b);

	public List<Bus> deleteBus(int id);

}
