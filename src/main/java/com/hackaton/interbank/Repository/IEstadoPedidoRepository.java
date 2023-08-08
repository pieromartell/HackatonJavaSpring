package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.interbank.Entity.EstadoPedido;

public interface IEstadoPedidoRepository extends JpaRepository<EstadoPedido, Integer> {

}
