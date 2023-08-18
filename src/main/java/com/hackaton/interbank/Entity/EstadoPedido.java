package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="EstadoPedido")
@Data
public class EstadoPedido {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	@Column(name="idEstado")
	int idEstado;
	
	@Column(name="descripcion")
	String descripcion;
	
	@Column(name="estado")
	Boolean estado;


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
