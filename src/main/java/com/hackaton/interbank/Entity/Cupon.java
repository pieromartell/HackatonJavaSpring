package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Cupon")
@Data
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
