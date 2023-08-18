package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import com.hackaton.interbank.Entity.EstadoPedido;

public interface IEstadoPedidoService {
	List<EstadoPedido> findAll();
	
	Optional<EstadoPedido> findById(int id);
	
	EstadoPedido add(EstadoPedido e);
	
	
	EstadoPedido update(EstadoPedido e);
	
	
	EstadoPedido delete(EstadoPedido e);
	
	

}
