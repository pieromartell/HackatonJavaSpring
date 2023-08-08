package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Producto")
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

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
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

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getIamgen1() {
		return iamgen1;
	}

	public void setIamgen1(String iamgen1) {
		this.iamgen1 = iamgen1;
	}

	public boolean isEstado_p() {
		return estado_p;
	}

	public void setEstado_p(boolean estado_p) {
		this.estado_p = estado_p;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

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
