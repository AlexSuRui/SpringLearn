package com.service;

import java.util.List;

import com.domain.Car;
import com.domain.Vehicule;

public interface RentService {
	
	public List<Vehicule> getVehicule();
	
//	public List<Car> getCars();
	
	public Car newCar();
	
}
