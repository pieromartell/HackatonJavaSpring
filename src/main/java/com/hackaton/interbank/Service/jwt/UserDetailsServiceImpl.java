package com.hackaton.interbank.Service.jwt;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hackaton.interbank.Entity.Cliente;
import com.hackaton.interbank.Repository.IClienteRepository;
import com.hackaton.interbank.Repository.IClienteuserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	
	@Autowired
	private IClienteuserRepository clienteuserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Cliente cliente = clienteuserRepository.FindFirstByUsername(username);
		if(cliente == null) throw new UsernameNotFoundException("Username not found", null);
		return new  org.springframework.security.core.userdetails.User(cliente.getUsername(), cliente.getPassword(), new ArrayList<>());
	}

}
