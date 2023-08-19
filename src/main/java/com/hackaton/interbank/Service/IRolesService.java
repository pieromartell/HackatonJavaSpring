package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import com.hackaton.interbank.Entity.Rol;

public interface IRolesService {
	
	List<Rol> findAll();
	 
	Optional<Rol> FindById(int id);
	
	Rol add (Rol r);
	
	Rol update(Rol r);
	
	Rol delete(Rol r);
	

}
