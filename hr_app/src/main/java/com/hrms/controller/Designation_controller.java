package com.hrms.controller;

import com.hrms.model.Designation_master;
import com.hrms.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Designation_controller {

    @Autowired
    private DesignationService designationService;

//	@GetMapping("/designation/{id}")
//	public Optional<Designation_master>getDesignationById(@PathVariable Integer id){
//		Optional<Designation_master> designation_master=this.designationService.getDesignationById(id);
//		return designation_master;
//	}
//

    @GetMapping("/GetDesignationDetails")
    public ResponseEntity<List<Designation_master>> getAllDesignation(){
        List<Designation_master>designationmaster=this.designationService.getAllDesignation();
        return new ResponseEntity<List<Designation_master>>(designationmaster, HttpStatus.OK);

    }

}
