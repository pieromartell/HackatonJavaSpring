package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="cupon")
@Table(name="cupon")
public class Cupon {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcupon")
	int idcupon;
	
	@Column(name="descripcion")
	String descripcion;
	
	@Column(name="descuento")
	String descuento;

	@Column(name="estado")
	boolean estado;
	public int getIdcupon() {
		return idcupon;
	}

	public void setIdcupon(int idcupon) {
		this.idcupon = idcupon;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public Cupon(int idcupon, String descripcion, String descuento, boolean estado) {
		super();
		this.idcupon = idcupon;
		this.descripcion = descripcion;
		this.descuento = descuento;
		this.estado = estado;
	}
	
	
	
	
	
	
}
