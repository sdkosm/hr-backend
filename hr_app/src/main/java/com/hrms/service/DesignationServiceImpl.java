package com.hrms.service;


import com.hrms.model.Designation_master;
import com.hrms.repository.DesignationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationServiceImpl implements DesignationService{

    @Autowired
    private DesignationRepo designationRepo;

    @Override
    public List<Designation_master> getAllDesignation() {
        List<Designation_master> designationmaster=this.designationRepo.findAll();

        return designationmaster ;
    }

//	@Override
//	public Optional<Designation_master> getDesignationById(Integer id) {
//		Optional<Designation_master> designation_master=this.designationRepo.findById(id);
//
//		return designation_master;
//	}

}
