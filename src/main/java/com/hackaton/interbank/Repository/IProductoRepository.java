package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.interbank.Entity.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
