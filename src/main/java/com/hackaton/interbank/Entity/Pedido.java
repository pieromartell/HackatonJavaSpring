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

@Entity
@Table(name="Pedido")
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

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EstadoPedido getEstadoPeiddo() {
		return estadoPeiddo;
	}

	public void setEstadoPeiddo(EstadoPedido estadoPeiddo) {
		this.estadoPeiddo = estadoPeiddo;
	}

	public Cupon getCupon() {
		return cupon;
	}

	public void setCupon(Cupon cupon) {
		this.cupon = cupon;
	}

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
