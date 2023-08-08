package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.interbank.Entity.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {

}
