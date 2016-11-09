package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.domain.Car;
import com.domain.Vehicule;

public class RentServiceImpl implements RentService	{

	private EntityManager entityManager;
	
	public RentServiceImpl() throws Exception{
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityManager");
		entityManager = emf.createEntityManager();
		Query query = entityManager.createQuery("select vehicules from Vehicule vehicules");
		List<Vehicule> voitures = query.getResultList();
		if(voitures.isEmpty()){
			this.newCar();
		}
		
	}
/*	
	@Override
	public List<Car> getCars() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select cars from Car cars");
		List<Car> cars = query.getResultList();
		List<Car> carList = new ArrayList<Car>();
		Vehicule voiture;
		for(Car car : cars){
			if(car.isRented() == false){
				voiture = new Car();
				carList.add((Car) voiture);
			}
		}
		return carList;
	}
*/
	@Override
	public Car newCar() {
		// TODO Auto-generated method stub
		int plateNumber = (int) (Math.random()*1000);
		Car car = new Car();
		String num = Integer.toString(plateNumber);
		car.setPlageNum(num);
		car.setNameV("My car"+plateNumber);
		car.setSeatsNum(4);
		car.setRend(false);
		return car;
	}

	@Override
	public List<Vehicule> getVehicule() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select vehicules from Vehicule vehicules");
		List<Vehicule> voitures = query.getResultList();
		List<Vehicule> voitureList = new ArrayList<Vehicule>();
		Vehicule voiture;
		for(Vehicule vehicule : voitures){
			if(vehicule.isRented() == false){
				voiture = new Car();
				voitureList.add((Car) voiture);
			}
		}
		return voitureList;
	}

	
}
