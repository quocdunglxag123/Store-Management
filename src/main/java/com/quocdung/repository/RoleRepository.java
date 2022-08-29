package com.quocdung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quocdung.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findOneById(Integer id);
}
