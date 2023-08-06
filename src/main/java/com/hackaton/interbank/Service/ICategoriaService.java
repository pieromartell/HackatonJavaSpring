package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Categoria;


public interface ICategoriaService  {

	List<Categoria> findAll();
	
	//Buscar por codigo
	Optional<Categoria> findById(long id);
	
	//Registrar datos
	Categoria add(Categoria c);
	
	//Actualizar datos
	Categoria update(Categoria c);
	
	//Eliminar datos
	Categoria delete(Categoria c);
}
