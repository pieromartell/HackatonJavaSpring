package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcliente")
	int idcliente;
	
	@Column(name="username")
	String username;
	
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;
	
	@Column(name="estado")
	Boolean estado;

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Cliente() {
		super();
	}

	public Cliente(int idcliente, String username, String email, String password, Boolean estado) {
		super();
		this.idcliente = idcliente;
		this.username = username;
		this.email = email;
		this.password = password;
		this.estado = estado;
	}
	
	

}
