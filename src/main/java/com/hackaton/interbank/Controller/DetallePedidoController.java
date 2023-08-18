package com.hackaton.interbank.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackaton.interbank.Entity.DetallePedido;
import com.hackaton.interbank.Service.IDetallePedidoService;

@RestController
@RequestMapping("/DetallePedido")
public class DetallePedidoController {
	
	@Autowired
	private IDetallePedidoService service;
	
	@GetMapping("/ListarDetalle")
	public List<DetallePedido> findAll(){
		return service.findAll();
	}
	@GetMapping("/ListarDetalle/{id}")
	public Optional<DetallePedido> findById(@PathVariable int id){
		return service.findById(id);
	}
	
	@PostMapping("/addDetalle")
	public DetallePedido add(@RequestBody DetallePedido d) {
		return service.add(d);
	}
	

	@PutMapping("/updateDetalle/{id}")
	public DetallePedido update(@PathVariable int id, @RequestBody DetallePedido c) {
		c.setIddetalle(id);
		return service.update(c);
	}

}
