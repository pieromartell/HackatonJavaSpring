package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import com.hackaton.interbank.Entity.Cupon;

public interface ICuponService {

	List<Cupon> findAll();
	
	Optional<Cupon> findById(int id);
	
	Cupon add (Cupon c);
	
	Cupon Update(Cupon c);
	
	Cupon delete(Cupon c);
	
}
