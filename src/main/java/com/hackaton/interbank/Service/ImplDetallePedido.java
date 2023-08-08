package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Categoria;
import com.hackaton.interbank.Entity.DetallePedido;
import com.hackaton.interbank.Repository.IDetallePedidoRepository;

@Service
public class ImplDetallePedido implements IDetallePedidoService {
	
	@Autowired
	private IDetallePedidoRepository repository;
	

	@Override
	public List<DetallePedido> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<DetallePedido> findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public DetallePedido add(DetallePedido d) {
		// TODO Auto-generated method stub
		return repository.save(d);
	}

	@Override
	public DetallePedido update(DetallePedido d) {
		// TODO Auto-generated method stub
		DetallePedido obj = repository.getById(d.getIddetalle());
        BeanUtils.copyProperties(d, obj);
        return repository.save(obj);
	}



}
