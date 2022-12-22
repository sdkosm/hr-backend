package com.hrms.controller;

import com.hrms.model.Role_master;
import com.hrms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Role_master_controller {


    @Autowired
    private RoleService roleService;

    @GetMapping("/GetRolesDetails")
    public ResponseEntity<List<Role_master>> getAllRole(){
        List<Role_master> rolemaster=this.roleService.getAllRole();
        return new ResponseEntity<List<Role_master>>(rolemaster, HttpStatus.OK);

    }
}
