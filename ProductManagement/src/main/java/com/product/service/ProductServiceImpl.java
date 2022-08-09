package com.product.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.Productdao;
import com.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private Productdao productdao;
	
	@Override
	public String createProduct(Product product) {
		// TODO Auto-generated method stub
		String makeProduct = productdao.makeProduct(product);
		return makeProduct;
	}

	@Override
	public List<Map<String, Object>> getAllProduct() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> allProduct = productdao.getAllProduct();
		return allProduct;
	}

	@Override
	public String updateProduct(Product p, int id) {
		// TODO Auto-generated method stub
		String updateProduct = productdao.updateProductById(p, id);
		return updateProduct;
	}

	@Override
	public String deleteProductById(int id) {
		// TODO Auto-generated method stub
		String deleteProduct = productdao.deleteProductById(id);
		return deleteProduct;
	}

	@Override
	public Map<String, Object> getProductById(int id) {
		// TODO Auto-generated method stub
		Map<String, Object> productById = productdao.productById(id);
		return productById;
	}

	
	  
	 

}
