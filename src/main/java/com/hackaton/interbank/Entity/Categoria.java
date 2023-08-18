package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="Categoria")
@Entity
@Data
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
