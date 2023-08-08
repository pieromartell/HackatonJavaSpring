package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.interbank.Entity.DetallePedido;



public interface IDetallePedidoRepository extends JpaRepository<DetallePedido, Integer> {

}
