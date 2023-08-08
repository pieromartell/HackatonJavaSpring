package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Producto")
@Data
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproducto")
	int idproducto;
	
	@Column(name="nombre")
	String nombre;

	@Column(name="descripcion")
	String descripcion;
	
	@Column(name="igv")
	double igv;
	
	@Column(name="imagen")
	String imagen;
	
	@Column(name="descuento")
	double descuento;
	
	@Column(name="iamgen1")
	String iamgen1;
	
	@Column(name="estado_p")
	boolean estado_p;
	
	@ManyToOne
	@JoinColumn(name="idcategoria")
	private Categoria categoria;

	

	public Producto() {
		super();
	}

	public Producto(int idproducto, String nombre, String descripcion, double igv, String imagen,
			double descuento, String iamgen1, boolean estado_p, Categoria categoria) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.igv = igv;
		this.imagen = imagen;
		this.descuento = descuento;
		this.iamgen1 = iamgen1;
		this.estado_p = estado_p;
		this.categoria = categoria;
	}
	
	
	
	
	
	
	
}
