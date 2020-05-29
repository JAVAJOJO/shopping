package com.java.shopping.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopping.pojo.Product;
import com.java.shopping.pojo.Review;

public interface ReviewDAO extends JpaRepository<Review,Integer>{

	List<Review> findByProductOrderByIdDesc(Product product);
	int countByProduct(Product product);

}
