package com.product.service;

import java.util.List;
import java.util.Map;

import com.product.entity.Product;

public interface ProductService {

	public String createProduct(Product product);
	public List<Map<String, Object>> getAllProduct();
	public String updateProduct(Product p,int id);
	public String deleteProductById(int id);
	public Map<String, Object> getProductById(int id);
}
