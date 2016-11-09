package com.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.domain.Car;
import com.domain.Vehicule;
import com.service.RentService;
import com.service.RentServiceImpl;


@Controller
public class RentWebController {

	RentService service;
	
	public RentWebController() {
		try {
			service = new RentServiceImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
/*	*//**
	*
	* @return all cars 
	*//*
	@RequestMapping(value = "/Vehicule/Car", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Car> getCars() {
		return service.getCars();
	}
	*/
	/**
	*
	* @return all vehucules 
	*/
	@RequestMapping(value = "/Vehicule", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Vehicule> getVehicules() {
		return service.getVehicule();
	}
}
