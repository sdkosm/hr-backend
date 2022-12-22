package com.hrms.service;

import com.hrms.model.Employee_info;
import com.hrms.repository.Employee_infoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//this class is responsible for, User is present or not in database if present then show user details otherwise throw exception

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    Employee_infoRepo userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Employee_info user=userDetailsRepository.findByUserName(username);

        if(null==user) {
            throw new UsernameNotFoundException("User Not Found with userName "+username);
        }
        return user;
    }

}
