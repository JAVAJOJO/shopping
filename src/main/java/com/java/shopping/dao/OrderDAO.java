package com.java.shopping.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopping.pojo.Order;
import com.java.shopping.pojo.User;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
