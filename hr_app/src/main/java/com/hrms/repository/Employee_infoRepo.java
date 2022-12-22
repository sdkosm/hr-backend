package com.hrms.repository;

import com.hrms.model.Employee_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interface repository
@Repository
public interface Employee_infoRepo extends JpaRepository<Employee_info, Integer> {

    Employee_info findByUserName(String userName);

}

