package com.hackaton.interbank.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Estado_Pedido")
@Table(name ="Estado_Pedido")
public class Estado_Pedido {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	@Column(name="idEstado")
	int idEstado;
	
	@Column(name="descripcion")
	String descripcion;

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	public Estado_Pedido() {
		super();
	}

	public Estado_Pedido(int idEstado, String descripcion) {
		super();
		this.idEstado = idEstado;
		this.descripcion = descripcion;
	}
	
	
	
	
	
}
