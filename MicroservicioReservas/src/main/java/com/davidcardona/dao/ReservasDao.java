package com.davidcardona.dao;

import java.util.List;

import com.davidcardona.model.Reserva;

public interface ReservasDao {
	
	public void generarReserva(Reserva reserva);
	
	List<Reserva> getReservas();

}
