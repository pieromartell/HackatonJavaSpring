package com.hackaton.interbank.Entity;

import java.sql.Date;

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
@Table(name="Pedido")
@Data
public class Pedido {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpedido")
	int idpedido;
	
	@Column(name="fecha")
	Date fecha;
	
	@Column(name="subtotal")
	double subtotal;
	
	@Column(name="igv")
	double igv;
	
	@Column(name="total")
	double total;
	
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="idEstado")
	private EstadoPedido estadoPeiddo;
	
	@ManyToOne
	@JoinColumn(name="idcupon")
	private Cupon cupon;

	
	public Pedido() {
		super();
	}

	public Pedido(int idpedido, Date fecha, double subtotal, double igv, double total, Cliente cliente,
			EstadoPedido estadoPeiddo, Cupon cupon) {
		super();
		this.idpedido = idpedido;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.igv = igv;
		this.total = total;
		this.cliente = cliente;
		this.estadoPeiddo = estadoPeiddo;
		this.cupon = cupon;
	}
	
	
	
}
