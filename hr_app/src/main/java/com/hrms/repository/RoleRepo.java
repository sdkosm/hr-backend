package com.hrms.repository;

import com.hrms.model.Role_master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role_master, Integer> {

}
