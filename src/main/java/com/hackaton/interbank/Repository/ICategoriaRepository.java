package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.interbank.Entity.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{


}
