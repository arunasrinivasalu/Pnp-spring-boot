package com.aruna.pnp.PNPService.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aruna.pnp.PNPService.model.Rate;
import com.aruna.pnp.PNPService.model.RateRepository;

@Service
public class RateService {

	@Autowired
	RateRepository rateRepository;
	
//	private List<Rate> products = new ArrayList<>(Arrays.asList(new Rate("11","Checking",new Date(), new Rate("R10","1.01 APR",1.01)),
//			new Rate("15","Rewards Checking",new Date(), new Rate("R15","1.21 APR",1.21)),
//			new Rate("25","Rewards Checking Plus",new Date(), new Rate("R25","2.21 APR",2.21))));
//	
	public List<Rate> getAllRates()
	{
		List<Rate> rateList = new ArrayList<Rate>();
		 rateRepository.findAll().forEach(rateList::add);
		 
		 return rateList;
	}
	
	public String createRate(Rate rate)
	{
		//products.stream().findFirst().
		rateRepository.save(rate);
		
		return rate.getRateId();
	}
	
	public void deleteRate(String id)
	{
		rateRepository.delete(id);	
	}

	public Rate getRate(String rateId) {
		return rateRepository.findOne(rateId);  
		
	}

	public void updateRate(String rateId, Rate rate) {
		rate.setRateId(rateId);
		rateRepository.save(rate);
	}
}
