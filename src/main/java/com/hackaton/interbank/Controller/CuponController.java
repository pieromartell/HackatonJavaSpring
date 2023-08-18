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

import com.hackaton.interbank.Entity.Cupon;
import com.hackaton.interbank.Service.ICuponService;

@RestController
@RequestMapping("/Cupon")
public class CuponController {

	@Autowired
	private ICuponService service;
	
	@GetMapping("/Listar")
	public List<Cupon> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/Listar/{id}")
	public Optional<Cupon> findById(@PathVariable int id){
		return service.findById(id);
	}
	
	@PostMapping("/add")
	public Cupon add(@RequestBody Cupon c) {
		return service.add(c);
	}
	

	@PutMapping("/update/{id}")
	public Cupon update(@PathVariable int id, @RequestBody Cupon c) {
		c.setIdcupon(id);
		return service.Update(c);
	}

	
	@DeleteMapping("/delete/{id}")
	public Cupon update(@PathVariable int id) {
		Cupon obj = new Cupon();
		obj.setIdcupon(id);
		obj.setEstado(false);
		return service.delete(obj);
	}
	
}
