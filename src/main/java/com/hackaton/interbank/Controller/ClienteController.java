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

import com.hackaton.interbank.Entity.Cliente;
import com.hackaton.interbank.Service.ICategoriaService;
import com.hackaton.interbank.Service.IClienteService;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

	
	@Autowired
	private IClienteService service;
	
	@GetMapping("/Listar")
	public List<Cliente> findAll(){
		return service.findAll();
	}
	@GetMapping("/Listar/{id}")
	public Optional<Cliente> findById(@PathVariable int id){
		return service.findById(id);
	}
	
	@PostMapping("/add")
	public Cliente add(@RequestBody Cliente c) {
		return service.add(c);
	}
	

	@PutMapping("/update/{id}")
	public Cliente update(@PathVariable int id, @RequestBody Cliente c) {
		c.setIdcliente(id);
		return service.update(c);
	}

	
	@DeleteMapping("/delete/{id}")
	public Cliente update(@PathVariable int id) {
		Cliente obj = new Cliente();
		obj.setIdcliente(id);
		obj.setEstado(false);
		return service.delete(obj);
	}
	
}
