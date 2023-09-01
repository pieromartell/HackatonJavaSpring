package com.hackaton.interbank.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hackaton.interbank.Entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
	@Query("SELECT c.roles.idrol FROM Cliente c WHERE c.username = :username")
	Long findIdrolByUsername(@Param("username") String username);
}
