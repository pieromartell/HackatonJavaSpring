package com.hackaton.interbank.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class SignupDTO {
	
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

}
