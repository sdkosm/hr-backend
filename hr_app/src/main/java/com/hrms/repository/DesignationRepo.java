package com.hrms.repository;

import com.hrms.model.Designation_master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepo extends JpaRepository<Designation_master, Integer> {


}
