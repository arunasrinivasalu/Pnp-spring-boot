package com.aruna.pnp.PNPService.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aruna.pnp.PNPService.model.Rate;
import com.aruna.pnp.PNPService.service.RateService;

@RestController
public class RateRestController {

	@Autowired
	RateService rateService; 
	
	@RequestMapping("/rates")
	List<Rate> getAllRates()
	{
		return rateService.getAllRates();
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/rates")
	String createRate(@RequestBody Rate rate)
	{
		return rateService.createRate(rate);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value ="/rates/{rateId}")
	void deleteRate(@PathVariable String rateId)
	{
		System.out.println(rateId);
		rateService.deleteRate(rateId);
	}
	@RequestMapping(method=RequestMethod.GET, value ="/rates/{rateId}")
	Rate getRate(@PathVariable String rateId)
	{
		return rateService.getRate(rateId);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value ="/rates/{rateId}")
	void createRate(@PathVariable String rateId, @RequestBody Rate rate)
	{
		 rateService.updateRate(rateId,rate);
	}
}
