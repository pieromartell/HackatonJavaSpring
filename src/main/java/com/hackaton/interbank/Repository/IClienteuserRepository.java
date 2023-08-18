package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hackaton.interbank.Entity.Cliente;

public interface IClienteuserRepository extends JpaRepository<Cliente, Integer> {
	@Query("SELECT c FROM Cliente c WHERE c.username = :username")
	Cliente FindFirstByUsername(String username);
}
