package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Categoria;
import com.hackaton.interbank.Repository.CatgoriaRepository;

@Service
public class ImplCategoriaService implements ICategoriaService{
	@Autowired 
	private CatgoriaRepository repository;
	
	
	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	

	@Override
	public Optional<Categoria> findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Categoria add(Categoria c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Categoria update(Categoria c) {
		// TODO Auto-generated method stub
		Categoria obj = repository.getById(c.getIdcategoria());
        BeanUtils.copyProperties(c, obj);
        return repository.save(obj);
	}

	@Override
	public Categoria delete(Categoria c) {
		// TODO Auto-generated method stub
		Categoria obj = repository.getById(c.getIdcategoria());
		obj.setEstado(false);
        return repository.save(obj);
	}

}
