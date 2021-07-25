package com.davidcardona.service;

import java.util.List;

import com.davidcardona.model.Reserva;

public interface ReservasService {
	void realizarReserva(Reserva reserva, int totalPersonas);
	List<Reserva> getReservas();

}
