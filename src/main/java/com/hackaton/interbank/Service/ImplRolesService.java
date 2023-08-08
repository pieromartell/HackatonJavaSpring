package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Roles;
import com.hackaton.interbank.Repository.IRolesRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
@Service
public class ImplRolesService implements IRolesService{

	@Autowired
	private IRolesRepository repository;
	
	
	@Override
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Roles> FindById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Roles add(Roles r) {
		// TODO Auto-generated method stub
		return repository.save(r);
	}

	@Override
	public Roles update(Roles r) {
		// TODO Auto-generated method stub
		Roles obj = repository.getById(r.getIdrol());
		BeanUtils.copyProperties(r, obj);
		return repository.save(obj);
	}

	@Override
	public Roles delete(Roles r) {
		// TODO Auto-generated method stub
		Roles obj = repository.getById(r.getIdrol());
		obj.setEstado(false);	
		return repository.save(obj);
	}

}
