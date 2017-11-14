package com.aruna.pnp.PNPService.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Product {

	@Id
	private String productId;
	private String productName;
	private Date createdDate;
	
	@OneToOne
	private Rate rate;
	public Product()
	{
		super();
	}
	public Product(String productId, String prdName, Date createdDate, Rate rate)
	{
		super();
		
		this.productId= productId;
		this.productName = prdName;
		this.createdDate = createdDate;
		this.rate= rate;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	//@XmlTransient
	public Rate getRate() {
		return rate;
	}
	public void setRate(Rate rate) {
		this.rate = rate;
	}
	
	
}
