package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Rol;

import com.hackaton.interbank.Repository.IRolesRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
@Service
public class ImplRolesService implements IRolesService{

	@Autowired
	private IRolesRepository repository;
	
	
	@Override
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Rol> FindById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Rol add(Rol r) {

		// TODO Auto-generated method stub
		return repository.save(r);
	}

	@Override
	public Rol update(Rol r) {
		// TODO Auto-generated method stub
		Rol obj = repository.getById(r.getIdrol());
		BeanUtils.copyProperties(r, obj);
		return repository.save(obj);
	}

	@Override
	public Rol delete(Rol r) {
		// TODO Auto-generated method stub
		Rol obj = repository.getById(r.getIdrol());

		obj.setEstado(false);	
		return repository.save(obj);
	}

}
