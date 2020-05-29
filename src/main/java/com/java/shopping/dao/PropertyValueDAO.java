package com.java.shopping.dao;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopping.pojo.Product;
import com.java.shopping.pojo.Property;
import com.java.shopping.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}
