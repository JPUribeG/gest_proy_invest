package com.example.gest_proy_invest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gest_proy_invest.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	
}
