package com.hackaton.interbank.dto;

import org.springframework.web.multipart.MultipartFile;

import com.hackaton.interbank.Entity.Rol;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

	

	@Column(name="idcliente")
	int idcliente;
	
	@Column(name="username")
	String username;
	
	@Column(name="name")
	String name;
	
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;
	
	@Column(name="estado")
	Boolean estado;
	

	@Column(name="idrol")
	private Rol roles;
	
	//private MultipartFile 
	
}
