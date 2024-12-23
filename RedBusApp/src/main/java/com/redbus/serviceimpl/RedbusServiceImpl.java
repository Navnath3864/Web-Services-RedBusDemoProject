package com.redbus.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redbus.model.Bus;
import com.redbus.repo.RedbusRepository;
import com.redbus.service.RedbusService;
@Service
public class RedbusServiceImpl implements RedbusService{

	@Autowired
	RedbusRepository redbusRepository;
	
	@Override
	public void addBus(Bus b) {
		redbusRepository.save(b);
	}

	@Override
	public List<Bus> getAllBuses() {
		return redbusRepository.findAll();
	}

	@Override
	public void addAllBuses(List<List<Bus>> listoflistofbus) {
		for(List<Bus> llb : listoflistofbus) {
			for(Bus b:llb) {
				redbusRepository.save(b);
			}
		}
		
	}

}
