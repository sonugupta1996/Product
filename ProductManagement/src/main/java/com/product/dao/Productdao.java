package com.product.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;

@Repository
public class Productdao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public String makeProduct(Product p) {
		
		 String query= "insert into product(id,name,price,disc,stock) values(?,?,?,?,?)";
		 int update = jdbctemplate.update(query, p.getId(),p.getName(),p.getPrice(),p.getDisc(),p.isStock());
		System.out.println("Productdao.makeProduct()"+update);
		 return "product add in db";
	}
	
	public List<Map<String, Object>> getAllProduct() {
		
		String query = "select * from product";
		List<Map<String, Object>> queryForList = jdbctemplate.queryForList(query);
		return  queryForList;
	}
	public String updateProductById(Product p,int id) {
		
		String query="update product set name=?,price=?,disc=?,stock=? where id=?";
		int update = jdbctemplate.update(query,p.getName(),p.getPrice(),p.getDisc(),p.isStock(),id);
		p.setId(id);
		return"product is updated";
	}
	public String deleteProductById(int id) {
		String query= "delete  from product where id=?";
		int delete = jdbctemplate.update(query,id);
		return "Product is deleted ";
	}
	
	public Map<String, Object> productById(int id) {
		String query="select * from product where id= ? ";
		Map<String, Object> map = jdbctemplate.queryForMap(query,id);
		return map;
	}
}
