package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="Cliente")
@Data
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
