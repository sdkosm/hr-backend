package com.hrms.service;

import com.hrms.model.Employee_info;
import com.hrms.repository.Employee_infoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {
    @Autowired
    private Employee_infoRepo employeeinfoRepo;

    @Override
    public List<Employee_info> getAllEmployee() {
        List<Employee_info> employeeinfo=this.employeeinfoRepo.findAll();
        return employeeinfo;
    }
}
