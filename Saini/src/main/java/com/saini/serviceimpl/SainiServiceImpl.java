package com.saini.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.saini.model.Bus;
import com.saini.repository.SainiRepository;
import com.saini.service.SainiService;
@Service
public class SainiServiceImpl implements SainiService{
	@Autowired
	SainiRepository sainiRepository;
	@Override
	public Bus addBus(Bus b) {
		Bus bus = sainiRepository.save(b);
		return bus;
	}
	@Override
	public Bus getBus(int id) {
	Optional <Bus> bus=sainiRepository.findById(id);
	if(bus!=null) {
		return bus.get();
	}
	return null;
	}
	@Override
	public List<Bus> getAllBus() {
		List<Bus> listBus=sainiRepository.findAll();
		return listBus;
	}
	@Override
	public Bus updateBus(Bus b) {
		Optional<Bus> oldbus=sainiRepository.findById(b.getId());
		if(oldbus!=null) {
			Bus bb =oldbus.get();
			bb.setId(b.getId());
			bb.setName(b.getName());
			bb.setBusno(b.getBusno());
			bb.setTicket(b.getTicket());
			bb.setFromLocation(b.getFromLocation());
			bb.setToLocation(b.getToLocation());
			bb.setDate(b.getDate());
			bb.setTime(b.getTime());
			sainiRepository.save(bb);
			return bb;
		}
		return null;
		
	}
	@Override
	public List<Bus> deleteBus(int id) {
		sainiRepository.deleteById(id);
		List<Bus> busList=sainiRepository.findAll();
		return busList;
	}
	
}
