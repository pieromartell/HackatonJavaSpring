package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="EstadoPedido")
public class EstadoPedido {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	@Column(name="idEstado")
	int idEstado;
	
	@Column(name="descripcion")
	String descripcion;
	
	@Column(name="estado")
	Boolean estado;

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

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public EstadoPedido() {
		super();
	}

	public EstadoPedido(int idEstado, String descripcion, Boolean estado) {
		super();
		this.idEstado = idEstado;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	


	
	
	
	
	
}
