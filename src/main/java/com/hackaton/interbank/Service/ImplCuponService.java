package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Cupon;
import com.hackaton.interbank.Repository.ICuponRepository;

@Service
public class ImplCuponService implements ICuponService{

	@Autowired
	private ICuponRepository repository;
	
	@Override
	public List<Cupon> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Cupon> findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Cupon add(Cupon c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Cupon Update(Cupon c) {
		// TODO Auto-generated method stub
		Cupon obj = repository.getById(c.getIdcupon());
		BeanUtils.copyProperties(c, obj);
		return repository.save(obj);
	}

	@Override
	public Cupon delete(Cupon c) {
		// TODO Auto-generated method stub
		Cupon obj = repository.getById(c.getIdcupon());
		obj.setEstado(false);
		return repository.save(obj);
	}

}
