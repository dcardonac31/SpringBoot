package com.davidcardona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.davidcardona.dao.ReservasDao;
import com.davidcardona.model.Reserva;

@Service
public class ReservasServiceImpl implements ReservasService{

	@Autowired
	ReservasDao reservas;
	@Autowired
	RestTemplate template;
	String url = "http://servicio-vuelos";
	
	@Override
	public void realizarReserva(Reserva reserva, int totalPersonas) {
		reservas.generarReserva(reserva);
		/*Como no le pasamos nada en el cuerpo ponemos null*/
		template.put(url+"/vuelos/{p1}/{p2}",null,reserva.getIdVuelo(),totalPersonas);
		
	}

	@Override
	public List<Reserva> getReservas() {
		return this.reservas.getReservas();
	}

}
