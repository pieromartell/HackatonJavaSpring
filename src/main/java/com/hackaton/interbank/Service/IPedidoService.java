package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import com.hackaton.interbank.Entity.Categoria;
import com.hackaton.interbank.Entity.Pedido;

public interface IPedidoService {
	
	List<Pedido> findAll();

	Optional<Pedido> findById(int id);

	Pedido add(Pedido p);

	Pedido update(Pedido p);

}
