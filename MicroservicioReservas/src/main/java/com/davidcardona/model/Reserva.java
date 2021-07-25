package com.davidcardona.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Reservas database table.
 * 
 */
@Entity
@Table(name="Reservas")
@NamedQuery(name="Reserva.findAll", query="SELECT r FROM Reserva r")
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Dni")
	private String dni;

	@Column(name="IdHotel")
	private int idHotel;

	@Column(name="IdVuelo")
	private int idVuelo;

	@Column(name="Nombre")
	private String nombre;

	public Reserva() {
	}

	public Reserva(int id, String dni, int idHotel, int idVuelo, String nombre) {
		super();
		this.id = id;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
		this.nombre = nombre;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdHotel() {
		return this.idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getIdVuelo() {
		return this.idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}