package com.aruna.pnp.PNPService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rate {

	@Id
	private String rateId;
	private String description;
	private double apr;
	
	public Rate()
	{
		
	}
	public Rate(String rateId, String description, double apr)
	{
		this.rateId = rateId;
		this.description = description;
		this.apr=apr;
	}
	
	public String getRateId() {
		return rateId;
	}
	public void setRateId(String rateId) {
		this.rateId = rateId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getApr() {
		return apr;
	}
	public void setApr(double apr) {
		this.apr = apr;
	}
}
