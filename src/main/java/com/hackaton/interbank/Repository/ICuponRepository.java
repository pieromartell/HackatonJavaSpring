package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.interbank.Entity.Cupon;

public interface ICuponRepository extends JpaRepository<Cupon, Integer>{

}
