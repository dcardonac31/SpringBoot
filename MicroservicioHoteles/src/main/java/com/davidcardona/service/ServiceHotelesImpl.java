package com.davidcardona.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidcardona.dao.HotelesDao;
import com.davidcardona.models.Hotel;

@Service
public class ServiceHotelesImpl implements ServiceHoteles {

	@Autowired
	HotelesDao dao;
	
	@Override
	public List<Hotel> devolverHotelesDisponibles() {
		List<Hotel> hoteles = dao.devolverHoteles();
		return hoteles.stream().filter(t -> t.getDisponible()==true).collect(Collectors.toList());
	}

}
