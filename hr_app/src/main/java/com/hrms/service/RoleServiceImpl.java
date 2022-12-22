package com.hrms.service;

import com.hrms.model.Role_master;
import com.hrms.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepo roleRepo;

    @Override
    public List<Role_master> getAllRole() {
        List<Role_master> rolemaster = this.roleRepo.findAll();
        return rolemaster;
    }
}
