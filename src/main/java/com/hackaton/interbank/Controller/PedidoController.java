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
import com.hackaton.interbank.Entity.Pedido;
import com.hackaton.interbank.Service.IPedidoService;

@RestController
@RequestMapping("/Pedido")
public class PedidoController {

	@Autowired
	private IPedidoService service;
	
	@GetMapping("/Listar")
	public List<Pedido> findAll(){
		return service.findAll();
	}
	@GetMapping("/Listar/{id}")
	public Optional<Pedido> findById(@PathVariable int id){
		return service.findById(id);
	}
	
	@PostMapping("/add")
	public Pedido add(@RequestBody Pedido p) {
		return service.add(p);
	}
	

	@PutMapping("/update/{id}")
	public Pedido update(@PathVariable int id, @RequestBody Pedido p) {
		p.setIdpedido(id);
		return service.update(p);
	}

	
	
}
