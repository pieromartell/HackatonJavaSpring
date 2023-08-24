package com.hackaton.interbank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hackaton.interbank.Entity.Cliente;
import com.hackaton.interbank.Service.IClienteService;
import com.hackaton.interbank.dto.ClienteDTO;
import com.hackaton.interbank.dto.SignupDTO;

@RequestMapping
@RestController
public class SignupController {

	
	@Autowired
	private IClienteService clienteservice;
	
	
	@GetMapping("/Registrar")
	public ModelAndView mostrarFormularioDeRegistro(Model modelo) {
		System.out.println("La accion registrar se muestra en formulario");
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("Registrar");
	    modelAndView.addObject("signupDTO", new SignupDTO());
	    return modelAndView;
	}

	
	
	@PostMapping("/sign-up")
	public void signupCliente(@RequestBody SignupDTO signupDTO){
		
		System.out.println("La accion registrar se llevo a cabo");
		
		if(clienteservice.hasUserWithUsername(signupDTO.getUsername())) {
			System.out.println("User alredy exists");
		}
		
		ClienteDTO createCliente = clienteservice.createUser(signupDTO);
		if(createCliente == null) {
			System.out.println("No se puede crear la cuenta, hubo un error, avise a el developer");
		}else {
			System.out.println("Cuenta creada exitosamente");
		}
	}
}
