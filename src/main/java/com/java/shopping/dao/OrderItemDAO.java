package com.java.shopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopping.pojo.Order;
import com.java.shopping.pojo.OrderItem;
import com.java.shopping.pojo.Product;
import com.java.shopping.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}
