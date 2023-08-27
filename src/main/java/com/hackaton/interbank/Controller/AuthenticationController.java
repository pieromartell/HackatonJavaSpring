package com.hackaton.interbank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.io.JsonEOFException;
import com.hackaton.interbank.Entity.Cliente;
import com.hackaton.interbank.Repository.IClienteuserRepository;
import com.hackaton.interbank.Service.IClienteService;
import com.hackaton.interbank.Service.jwt.UserDetailsServiceImpl;
import com.hackaton.interbank.Utils.JwUtil;
import com.hackaton.interbank.dto.AuthenticationRequest;
import com.hackaton.interbank.dto.AuthenticationResponse;
import io.jsonwebtoken.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;
@RestController
public class AuthenticationController {
	
	@Autowired
	private IClienteService clienteService;
	
	
	@Autowired
	private  AuthenticationManager authenticationManager;
	
	@Autowired
	private  UserDetailsServiceImpl userDetailServiceImpl;

	
	@Autowired
	private IClienteuserRepository clienteuserRepository;
	
	@Autowired
	private JwUtil jwUtil;
	
	
	@GetMapping("/Login")
	public ModelAndView mostrarFormularioLogin(Model modelo) {
		System.out.println("Iniciando el formulario Login");
	    
	    ModelAndView modelAndView = new ModelAndView(); 
	    modelAndView.setViewName("login"); 
	    
	    modelAndView.addObject("authenticationRequest", new AuthenticationRequest());
	    return modelAndView; 
	}
	
	
	
	
	
	
	@PostMapping("/authenticate")
    public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationDTO, HttpServletResponse response) throws BadCredentialsException, DisabledException, UsernameNotFoundException, IOException, java.io.IOException {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationDTO.getUsername(), authenticationDTO.getPassword()));
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Incorrect username or password!");
        } catch (DisabledException disabledException) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "User is not activated");
            return null;
        }

        final UserDetails userDetails = userDetailServiceImpl.loadUserByUsername(authenticationDTO.getUsername());

         String jwt = jwUtil.generateToken(userDetails.getUsername());

        if(jwt != null) {
        	System.out.print(jwt);
        }
        
        Cookie jwtCookie = new Cookie("jwtToken", jwt);
        jwtCookie.setMaxAge(3600);
        jwtCookie.setPath("/");
        response.addCookie(jwtCookie);
        
        
        return new AuthenticationResponse(jwt);

    }
	
	
	
}
