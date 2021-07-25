package com.davidcardona.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the Vuelos database table.
 * 
 */
@Entity
@Table(name="Vuelos")
@NamedQuery(name="Vuelo.findAll", query="SELECT v FROM Vuelo v")
public class Vuelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Company")
	private String company;

	@Column(name="Fecha")
	private Timestamp fecha;

	@Column(name="Plazas")
	private int plazas;

	@Column(name="Precio")
	private BigDecimal precio;

	public Vuelo() {
	}
	
	public Vuelo(int id, String company, Timestamp fecha, int plazas, BigDecimal precio) {
		super();
		this.id = id;
		this.company = company;
		this.fecha = fecha;
		this.plazas = plazas;
		this.precio = precio;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public int getPlazas() {
		return this.plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}