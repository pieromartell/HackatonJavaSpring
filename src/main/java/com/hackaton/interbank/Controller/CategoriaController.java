package com.hackaton.interbank.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackaton.interbank.Entity.Categoria;
import com.hackaton.interbank.Service.ICategoriaService;

@RestController
@RequestMapping("/Categoria")
public class CategoriaController {
	
	@Autowired
	private ICategoriaService service;
	
	@GetMapping("Listar")
	public List<Categoria> findAll(){
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Categoria> findById(@PathVariable int id){
		return service.findById(id);
	}
	
	@PostMapping
	public Categoria add(@RequestBody Categoria c) {
		return service.add(c);
	}
	
	@PutMapping("/{id}")
	public Categoria update(@PathVariable int id, @RequestBody Categoria c) {
		c.setIdcategoria(id);
		return service.update(c);
	}
	
	@DeleteMapping("/{id}")
	public Categoria update(@PathVariable Long id) {
		Categoria obj = new Categoria();
		obj.setEstado(false);
		return service.delete(obj);
	}

}
