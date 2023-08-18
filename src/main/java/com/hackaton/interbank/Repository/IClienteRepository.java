package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hackaton.interbank.Entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
