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
@Table(name="Detallepedido")
public class DetallePedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddetalle")
	int iddetalle;
	
	@Column(name="cantidad")
	double cantidad;
	
	@Column(name="subtotal")
	double subtotal;
	
	@ManyToOne
	@JoinColumn(name="idpedido")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name="idproducto")
	private Producto producto;

	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public DetallePedido() {
		super();
	}

	public DetallePedido(int iddetalle, double cantidad, double subtotal, Pedido pedido, Producto producto) {
		super();
		this.iddetalle = iddetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.pedido = pedido;
		this.producto = producto;
	}
	
	

}
