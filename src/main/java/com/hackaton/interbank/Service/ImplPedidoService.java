package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Categoria;
import com.hackaton.interbank.Entity.Pedido;
import com.hackaton.interbank.Repository.IPedidoRepository;

@Service
public class ImplPedidoService implements IPedidoService {
	
	@Autowired
	private IPedidoRepository repository;
	

	@Override
	public List<Pedido> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Pedido> findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Pedido add(Pedido p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public Pedido update(Pedido p) {
		// TODO Auto-generated method stub
		Pedido obj = repository.getById(p.getIdpedido());
        BeanUtils.copyProperties(p, obj);
        return repository.save(obj);
	}


}
