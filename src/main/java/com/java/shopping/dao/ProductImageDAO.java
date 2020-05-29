package com.java.shopping.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopping.pojo.Product;
import com.java.shopping.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}
