package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hackaton.interbank.Entity.EstadoPedido;
import com.hackaton.interbank.Repository.IEstadoPedidoRepository;

@Service
public class ImpEstadoPedido implements IEstadoPedidoService {
	
	@Autowired
	private IEstadoPedidoRepository repository;

	@Override
	public List<EstadoPedido> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<EstadoPedido> findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public EstadoPedido add(EstadoPedido e) {
		// TODO Auto-generated method stub
		return repository.save(e);
	}

	@Override
	public EstadoPedido update(EstadoPedido e) {
		// TODO Auto-generated method stub
		EstadoPedido obj = repository.getById(e.getIdEstado());
        BeanUtils.copyProperties(e, obj);
        return repository.save(obj);
	}

	@Override
	public EstadoPedido delete(EstadoPedido e) {
		// TODO Auto-generated method stub
		EstadoPedido obj = repository.getById(e.getIdEstado());
		obj.setEstado(false);
        return repository.save(obj);

	}
	

}
