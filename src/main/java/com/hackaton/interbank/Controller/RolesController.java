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

import com.hackaton.interbank.Entity.Roles;
import com.hackaton.interbank.Service.IRolesService;

@RestController
@RequestMapping("/Roles")
public class RolesController {

	
	@Autowired
	private IRolesService service;
	
	
	@GetMapping("Listar")
	public List<Roles> findAll(){
		return service.findAll();
	}
	
	@GetMapping("Listar/{id}")
	public Optional<Roles> findById(@PathVariable int id){
		return service.FindById(id);
	}
	
	@PostMapping("/add")
	public Roles add(@RequestBody Roles r) {
		return service.add(r);
	}
	
	@PutMapping("/update/{id}")
	public Roles update(@PathVariable int id, @RequestBody Roles r) {
		r.setIdrol(id);
		return service.update(r);
	}
	
	@DeleteMapping("/delete/{id}")
	public Roles roles(@PathVariable int id) {
		Roles obj = new Roles();
		obj.setIdrol(id);
		obj.setEstado(false);
		return service.delete(obj);
	}
	
	
	
	
	
}
