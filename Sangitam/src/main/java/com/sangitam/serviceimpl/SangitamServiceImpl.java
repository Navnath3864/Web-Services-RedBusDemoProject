package com.sangitam.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sangitam.model.Bus;
import com.sangitam.repository.SangitamRepository;
import com.sangitam.service.SangitamService;
@Service
public class SangitamServiceImpl implements SangitamService{
	@Autowired
	SangitamRepository sangitamRepository;
	@Override
	public Bus addBus(Bus b) {
		Bus bus = sangitamRepository.save(b);
		return bus;
	}
	@Override
	public Bus getBus(int id) {
	Optional <Bus> bus=sangitamRepository.findById(id);
	if(bus!=null) {
		return bus.get();
	}
	return null;
	}
	@Override
	public List<Bus> getAllBus() {
		List<Bus> listBus=sangitamRepository.findAll();
		return listBus;
	}
	@Override
	public Bus updateBus(Bus b) {
		Optional<Bus> oldbus=sangitamRepository.findById(b.getId());
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
			sangitamRepository.save(bb);
			return bb;
		}
		return null;
		
	}
	@Override
	public List<Bus> deleteBus(int id) {
		sangitamRepository.deleteById(id);
		List<Bus> busList=sangitamRepository.findAll();
		return busList;
	}
	
}
