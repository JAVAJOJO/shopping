package com.java.shopping.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.java.shopping.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
