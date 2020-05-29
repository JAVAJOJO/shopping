package com.java.shopping.service;

import com.java.shopping.dao.AdminDAO;
import com.java.shopping.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminDAO adminDAO;
    public Admin get(String name, String password) {
        return adminDAO.getByNameAndPassword(name,password);
    }

}

