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

import com.hackaton.interbank.Entity.Producto;
import com.hackaton.interbank.Service.IProductoService;

@RestController
@RequestMapping("/Producto")
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping("/Listar")
	public List<Producto> findAll(){
		return service.findAll();
	}
	@GetMapping("/Listar/{id}")
	public Optional<Producto> findById(@PathVariable int id){
		return service.findById(id);
	}
	
	@PostMapping("/add")
	public Producto add(@RequestBody Producto c) {
		return service.add(c);
	}
	

	@PutMapping("/update/{id}")
	public Producto update(@PathVariable int id, @RequestBody Producto c) {
		c.setIdproducto(id);
		return service.update(c);
	}

	
	@DeleteMapping("/delete/{id}")
	public Producto Produc(@PathVariable int id) {
		Producto obj = new Producto();
		obj.setIdproducto(id);
		obj.setEstado_p(false);
		return service.delete(obj);
	}

}
