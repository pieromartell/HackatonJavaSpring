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
	private CatgoriaRepository categoryrepository;
	
	
	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return categoryrepository.findAll();
	}

	

	@Override
	public Optional<Categoria> findById(long id) {
		// TODO Auto-generated method stub
		return categoryrepository.findById(id);
	}

	@Override
	public Categoria add(Categoria c) {
		// TODO Auto-generated method stub
		return categoryrepository.save(c);
	}

	@Override
	public Categoria update(Categoria c) {
		// TODO Auto-generated method stub
		Categoria obj = categoryrepository.getById(c.getIdcategoria());
        BeanUtils.copyProperties(c, obj);
        return categoryrepository.save(obj);
	}

	@Override
	public Categoria delete(Categoria c) {
		// TODO Auto-generated method stub
		Categoria obj = categoryrepository.getById(c.getIdcategoria());
		obj.setEstado(false);
        return categoryrepository.save(obj);
	}

}
