package com.hackaton.interbank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackaton.interbank.Service.IClienteService;
import com.hackaton.interbank.dto.ClienteDTO;
import com.hackaton.interbank.dto.SignupDTO;

@RestController
@RequestMapping("/sign-up")
public class SignupController {

	
	@Autowired
	private IClienteService clienteservice;
	
	@PostMapping
	public ResponseEntity<?> signupCliente(@RequestBody SignupDTO signupDTO){
		ClienteDTO createCliente = clienteservice.createUser(signupDTO);
		if(createCliente == null) {
			return new ResponseEntity<>("No se puede Crear la cuenta, vuelva mas tarde",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(createCliente, HttpStatus.CREATED);
	}
}
