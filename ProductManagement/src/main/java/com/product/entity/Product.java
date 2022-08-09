package com.product.entity;

import lombok.Data;

@Data
public class Product {
	
	private int id;
	private String name;
	private double price;
	private String disc;
    private boolean stock;

}
