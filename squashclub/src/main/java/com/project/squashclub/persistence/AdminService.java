package com.project.squashclub.persistence;

import com.project.squashclub.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Iterable<Admin> giveAdmin(){
        return adminRepository.findAll();
    }

}
