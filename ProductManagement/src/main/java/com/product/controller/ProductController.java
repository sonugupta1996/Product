package com.product.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@PostMapping("/")
	public ResponseEntity<String> createProduct(@RequestBody Product product){
		
		String createProduct = productservice.createProduct(product);
		return new ResponseEntity<String>(createProduct, HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Map<String, Object>>> allProduct(){
		
		List<Map<String, Object>> allproduct = productservice.getAllProduct();
		return new ResponseEntity<>(allproduct,HttpStatus.CREATED);
	}
	@PostMapping("/{id}")
	public ResponseEntity<String> updateProductById(@RequestBody Product p,@PathVariable int id){
		
		String allproduct = productservice.updateProduct(p, id);
		return new ResponseEntity<>(allproduct,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable int id){
		
		String allproduct = productservice.deleteProductById(id);
		return new ResponseEntity<>(allproduct,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Map<String, Object>> fetchProductById(@PathVariable int id){
		
		Map<String, Object> product = productservice.getProductById(id);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
}