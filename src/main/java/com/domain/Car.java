package com.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car extends Vehicule{
	
	int numOfSeats;
	
	public Car(){
		super();
		this.type = "Car";	
		}
	
	@Id
	public int getSeatsNum(){
		return numOfSeats;
	}
	
	public void setSeatsNum(int newNum){
		this.numOfSeats = newNum;
	}
	
	
	
	
	
}
