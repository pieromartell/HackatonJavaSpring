package com.hackaton.interbank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Categoria;
import com.hackaton.interbank.Entity.Producto;
import com.hackaton.interbank.Repository.IProductoRepository;


@Service
public class ImplProductoService implements IProductoService {
	
	@Autowired
	private IProductoRepository repository;

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Producto> findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Producto add(Producto p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		Producto obj = repository.getById(p.getIdproducto());
        BeanUtils.copyProperties(p, obj);
        return repository.save(obj);
	}

	@Override
	public Producto delete(Producto p) {
		// TODO Auto-generated method stub
		Producto obj = repository.getById(p.getIdproducto());
		obj.setEstado_p(false);
        return repository.save(obj);
	}

}
