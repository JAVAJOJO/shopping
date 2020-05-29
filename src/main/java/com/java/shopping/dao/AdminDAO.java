package com.java.shopping.dao;

import com.java.shopping.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDAO extends JpaRepository<Admin,Integer> {
    Admin getByNameAndPassword(String name, String password);
}
