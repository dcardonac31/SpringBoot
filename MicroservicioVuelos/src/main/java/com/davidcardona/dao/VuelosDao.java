package com.davidcardona.dao;

import java.util.List;

import com.davidcardona.models.Vuelo;

public interface VuelosDao {
	
	public List<Vuelo> devolverVuelos();
	
	public Vuelo devolverVuelo(int idVuelo);
	
	public void actualizarVuelo(Vuelo vuelo);
}
