package com.hackaton.interbank.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.ws.rs.core.Context;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcategoria")
	int idcategoria;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="descripcion")
	String descripcion;
	
	@Column(name="estado")
	boolean estado;
	
	

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria() {
		super();
	}

	public Categoria(int idcategoria, String nombre, String descripcion, boolean estado) {
		super();
		this.idcategoria = idcategoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}


	
	
	
}
