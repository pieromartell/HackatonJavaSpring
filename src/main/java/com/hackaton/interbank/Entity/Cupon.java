package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cupon")
public class Cupon {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcupon")
	int idcupon;
	
	@Column(name="codigo")
	String codigo;
	
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
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

	public Cupon() {
		super();
	}

	public Cupon(int idcupon, String codigo, String descripcion, String descuento, boolean estado) {
		super();
		this.idcupon = idcupon;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.descuento = descuento;
		this.estado = estado;
	}


	
	
	
	
	
	
}
