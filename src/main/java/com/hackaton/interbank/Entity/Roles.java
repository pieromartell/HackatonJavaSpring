package com.hackaton.interbank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="roles")
@Data
@NoArgsConstructor
public class Roles {
	@Id
	@GeneratedValue()
	@Column(name="idrol")
	private int idrol;
	
	@Column(name="namerol")
	private String namerol;
	
	@Column(name="estado")
	private Boolean estado;
	


}
