package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import com.hackaton.interbank.Entity.Roles;

public interface IRolesService {
	
	List<Roles> findAll();
	 
	Optional<Roles> FindById(int id);
	
	Roles add (Roles r);
	
	Roles update(Roles r);
	
	Roles delete(Roles r);
	

}
