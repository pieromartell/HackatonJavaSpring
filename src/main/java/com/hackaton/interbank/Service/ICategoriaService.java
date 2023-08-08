package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;
import com.hackaton.interbank.Entity.Categoria;

public interface ICategoriaService  {

	List<Categoria> findAll();
	
	Optional<Categoria> findById(int id);
	
	Categoria add(Categoria c);
	
	
	Categoria update(Categoria c);
	

	Categoria delete(Categoria c);
}
