package com.gita.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gita.model.Bus;
import com.gita.repo.GitaRepository;
import com.gita.service.GitaService;
@Service
public class GitaServiceImpl implements GitaService{
	@Autowired
	GitaRepository gitaRepository;
	
	@Override
	public Bus addBus(Bus b) {
		Bus bus=gitaRepository.save(b);
		return bus;
	}

	@Override
	public Bus getBus(int id) {
		Optional<Bus> b=gitaRepository.findById(id);
		if(b!=null) {
			return b.get();
		}
		return null;
	}

	@Override
	public List<Bus> getAllBus() {
		List<Bus> busList=gitaRepository.findAll();
		return busList;
	}

	@Override
	public Bus updateBus(Bus b) {
		Optional<Bus> oldbus=gitaRepository.findById(b.getId());
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
			gitaRepository.save(bb);
			return bb;
			}
		return null;
	}

	@Override
	public List<Bus> deleteBus(int id) {
		gitaRepository.deleteById(id);
		List<Bus> busList=gitaRepository.findAll();
		return busList;
	}
	
}
