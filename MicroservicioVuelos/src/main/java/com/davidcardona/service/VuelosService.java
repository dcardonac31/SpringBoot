package com.davidcardona.service;

import java.util.List;

import com.davidcardona.models.Vuelo;

public interface VuelosService {
	
	List<Vuelo> recuperarVuelosDisponibles(int plazas);
	
	void actualizarPlazas(int id, int plazas);
}
