package com.davidcardona.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the Hoteles database table.
 * 
 */
@Entity
@Table(name="Hoteles")
@NamedQuery(name="Hotel.findAll", query="SELECT h FROM Hotel h")
public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Categoria")
	private int categoria;

	@Column(name="Disponible")
	private boolean disponible;

	@Column(name="Nombre")
	private String nombre;

	@Column(name="Precio")
	private BigDecimal precio;

	public Hotel() {
	}

	public Hotel(int id, int categoria, boolean disponible, String nombre, BigDecimal precio) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.disponible = disponible;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoria() {
		return this.categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public boolean getDisponible() {
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}