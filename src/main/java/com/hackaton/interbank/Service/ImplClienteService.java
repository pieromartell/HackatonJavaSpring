package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Cliente;
import com.hackaton.interbank.Repository.IClienteRepository;
import com.hackaton.interbank.Repository.IClienteuserRepository;
import com.hackaton.interbank.dto.ClienteDTO;
import com.hackaton.interbank.dto.SignupDTO;

@Service
public class ImplClienteService implements IClienteService {
	
	@Autowired
	private IClienteRepository repository;
	
	@Autowired
	private IClienteuserRepository userrepository;
	

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Cliente> findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Cliente add(Cliente c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		Cliente obj = repository.getById(c.getIdcliente());
        BeanUtils.copyProperties(c, obj);
        return repository.save(obj);
	}

	@Override
	public Cliente delete(Cliente c) {
		// TODO Auto-generated method stub
		Cliente obj = repository.getById(c.getIdcliente());
		obj.setEstado(false);
        return repository.save(obj);
	}

	@Override
	public ClienteDTO createUser(SignupDTO signupDTO) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setUsername(signupDTO.getUsername());
		cliente.setName(signupDTO.getName());
		cliente.setEmail(signupDTO.getEmail());
		cliente.setEstado(signupDTO.getEstado());
		cliente.setRoles(signupDTO.getRoles());
		cliente.setPassword(new BCryptPasswordEncoder().encode(signupDTO.getPassword()));
		Cliente createCliente=  repository.save(cliente);
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setIdcliente(createCliente.getIdcliente());
		clienteDTO.setName(createCliente.getName());
		clienteDTO.setUsername(createCliente.getUsername());
		clienteDTO.setEmail(createCliente.getEmail());
		clienteDTO.setEstado(createCliente.getEstado()); 
		clienteDTO.setRoles(createCliente.getRoles());
		return clienteDTO;
	}

	@Override
	public boolean hasUserWithUsername(String username) {
		// TODO Auto-generated method stub
		return userrepository.FindFirstByUsername(username) != null;
	}

}
