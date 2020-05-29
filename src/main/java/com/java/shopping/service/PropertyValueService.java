package com.java.shopping.service;

import com.java.shopping.dao.PropertyValueDAO;
import com.java.shopping.pojo.Product;
import com.java.shopping.pojo.Property;
import com.java.shopping.pojo.PropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyValueService  {

	@Autowired PropertyValueDAO propertyValueDAO;
	@Autowired PropertyService propertyService;

	public void update(PropertyValue bean) {
		propertyValueDAO.save(bean);
	}

	public void init(Product product) {
		List<Property> propertys= propertyService.listByCategory(product.getCategory());
		for (Property property: propertys) {
			PropertyValue propertyValue = getByPropertyAndProduct(product, property);
			if(null==propertyValue){
				propertyValue = new PropertyValue();
				propertyValue.setProduct(product);
				propertyValue.setProperty(property);
				propertyValueDAO.save(propertyValue);
			}
		}
	}

	public PropertyValue getByPropertyAndProduct(Product product, Property property) {
		return propertyValueDAO.getByPropertyAndProduct(property,product);
	}

	public List<PropertyValue> list(Product product) {
		return propertyValueDAO.findByProductOrderByIdDesc(product);
	}
	
	
	
}
