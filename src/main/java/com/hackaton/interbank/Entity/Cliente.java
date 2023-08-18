package com.hackaton.interbank.Entity;

import com.hackaton.interbank.dto.ClienteDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="Cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@ManyToOne
	@JoinColumn(name="idrol")
	private Roles roles; 

	public ClienteDTO mapClienteDTO() {
		return new ClienteDTO(idcliente,
				username,name,email,password,estado,roles);
	}





	
	

}
