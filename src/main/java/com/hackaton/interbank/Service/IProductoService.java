package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import com.hackaton.interbank.Entity.Producto;


public interface IProductoService {
	
	List<Producto> findAll();
	//Buscar por codigo
	Optional<Producto> findById(int id);
	//Registrar datos
	Producto add(Producto p);
	
	//Actualizar datos
	Producto update(Producto p);
	
	//Eliminar datos
	Producto delete(Producto p);

}
