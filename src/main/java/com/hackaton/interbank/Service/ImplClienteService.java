package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Cliente;
import com.hackaton.interbank.Repository.IClienteRepository;

@Service
public class ImplClienteService implements IClienteService {
	
	@Autowired
	private IClienteRepository repository;
	

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

}
