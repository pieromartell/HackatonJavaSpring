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

import com.hackaton.interbank.Entity.EstadoPedido;
import com.hackaton.interbank.Service.IEstadoPedidoService;

@RestController
@RequestMapping("/EstadoPedido")
public class EstadoPedidoController {

	@Autowired
	private IEstadoPedidoService service;
	
	@GetMapping("/Listar")
	public List<EstadoPedido> findAll(){
		return service.findAll();
	}
	@GetMapping("/Listar/{id}")
	public Optional<EstadoPedido> findById(@PathVariable int id){
		return service.findById(id);
	}
	
	@PostMapping("/add")
	public EstadoPedido add(@RequestBody EstadoPedido e) {
		return service.add(e);
	}
	

	@PutMapping("/update/{id}")
	public EstadoPedido update(@PathVariable int id, @RequestBody EstadoPedido c) {
		c.setIdEstado(id);
		return service.update(c);
	}

	
	@DeleteMapping("/delete/{id}")
	public EstadoPedido update(@PathVariable int id) {
		EstadoPedido obj = new EstadoPedido();
		obj.setIdEstado(id);
		obj.setEstado(false);
		return service.delete(obj);
	}
	
	
}
