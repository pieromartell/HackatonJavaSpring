package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackaton.interbank.Entity.Categoria;

@Repository
public interface CatgoriaRepository extends JpaRepository<Categoria, Long>{

}
