package com.hrms.service;

import com.hrms.model.Designation_master;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//why This is interface instead of class

public interface DesignationService {

    //get employee by id
    //	Optional<Designation_master> getDesignationById(Integer id);

    //get all details
    List<Designation_master> getAllDesignation();
}
