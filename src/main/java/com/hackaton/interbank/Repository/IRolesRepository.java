package com.hackaton.interbank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.interbank.Entity.Roles;

public interface IRolesRepository extends JpaRepository<Roles, Integer> {

}
