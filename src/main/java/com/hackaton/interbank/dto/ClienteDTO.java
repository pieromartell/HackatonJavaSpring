package com.hackaton.interbank.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ClienteDTO {

	public ClienteDTO(int idcliente2, String username2, String name2, String email2, String password2,
			Boolean estado2) {
		// TODO Auto-generated constructor stub
	}

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
	
	//private MultipartFile 
	
}
