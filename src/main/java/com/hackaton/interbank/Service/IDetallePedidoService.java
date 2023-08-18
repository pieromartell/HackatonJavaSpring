package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import com.hackaton.interbank.Entity.DetallePedido;


public interface IDetallePedidoService {
	
	List<DetallePedido> findAll();
	
	Optional<DetallePedido> findById(int id);
	
	DetallePedido add(DetallePedido d);
	
	
	DetallePedido update(DetallePedido d);
	
}
