package com.tesfai.springboot.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tesfai.springboot.springsecurity.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
