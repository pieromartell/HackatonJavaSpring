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
@Table(name="Detallepedido")
@Data
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
