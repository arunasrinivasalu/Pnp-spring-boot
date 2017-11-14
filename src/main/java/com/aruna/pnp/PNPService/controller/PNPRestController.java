package com.aruna.pnp.PNPService.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aruna.pnp.PNPService.model.Product;
import com.aruna.pnp.PNPService.service.ProductService;

@RestController
public class PNPRestController {

	@Autowired
	ProductService productService; 
	
	@RequestMapping("/products")
	List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/products")
	String createProduct(@RequestBody Product prod)
	{
		return productService.createProduct(prod);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value ="/products/{productId}")
	void deleteProduct(@PathVariable String productId)
	{
		System.out.println(productId);
		productService.deleteProduct(productId);
	}
	@RequestMapping(method=RequestMethod.GET, value ="/products/{productId}")
	Product getProduct(@PathVariable String productId)
	{
		return productService.getProduct(productId);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value ="/products/{productId}")
	void createProduct(@PathVariable String productId, @RequestBody Product prod)
	{
		 productService.updateProduct(productId,prod);
	}
}
