package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import com.hackaton.interbank.Entity.Cliente;
import com.hackaton.interbank.dto.ClienteDTO;
import com.hackaton.interbank.dto.SignupDTO;



public interface IClienteService {
	List<Cliente> findAll();
	
	Optional<Cliente> findById(int id);
	
	Cliente add(Cliente c);
	
	
	Cliente update(Cliente c);
	
	
	Cliente delete(Cliente c);

	ClienteDTO createUser(SignupDTO signupDTO);
}
