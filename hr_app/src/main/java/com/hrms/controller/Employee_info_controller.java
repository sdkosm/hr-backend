package com.hrms.controller;

import com.hrms.model.Employee_info;
import com.hrms.service.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Employee_info_controller {

    @Autowired
    private EmployeeInfoService employeeinfoservice;

    @GetMapping("/GetEmployeeInfo")
    public ResponseEntity<List<Employee_info>> getAllEmployee() {
        List<Employee_info> employeeinfo = this.employeeinfoservice.getAllEmployee();
        return new ResponseEntity<List<Employee_info>>(employeeinfo, HttpStatus.OK);
    }
}
