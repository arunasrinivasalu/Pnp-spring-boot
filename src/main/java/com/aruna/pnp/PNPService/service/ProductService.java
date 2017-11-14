package com.aruna.pnp.PNPService.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aruna.pnp.PNPService.model.Product;
import com.aruna.pnp.PNPService.model.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository prodRepository;
	
//	private List<Product> products = new ArrayList<>(Arrays.asList(new Product("11","Checking",new Date(), new Rate("R10","1.01 APR",1.01)),
//			new Product("15","Rewards Checking",new Date(), new Rate("R15","1.21 APR",1.21)),
//			new Product("25","Rewards Checking Plus",new Date(), new Rate("R25","2.21 APR",2.21))));
//	
	public List<Product> getAllProducts()
	{
		List<Product> prodList = new ArrayList<Product>();
		 prodRepository.findAll().forEach(prodList::add);
		 
		 return prodList;
	}
	
	public String createProduct(Product p)
	{
		//products.stream().findFirst().
		prodRepository.save(p);
		
		return p.getProductId();
	}
	
	public void deleteProduct(String id)
	{
		prodRepository.delete(id);	
	}

	public Product getProduct(String productId) {
		return prodRepository.findOne(productId);  
		
	}

	public void updateProduct(String productId, Product prod) {
		prod.setProductId(productId);
		prodRepository.save(prod);
	}
}
