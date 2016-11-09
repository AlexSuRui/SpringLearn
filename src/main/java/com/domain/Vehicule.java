package com.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Vehicule {

	private List<Rent> rents = new ArrayList<Rent>();
	String plageNumber;
	String nameV;
	boolean isRented = false;
	protected String type;
	
	@Id
	public String getPlageNum(){
		return plageNumber;
	}
	
	@OneToMany(cascade=(CascadeType.REMOVE),mappedBy="vehicule")
	public List<Rent> getRents(){
		return rents;
	}
	public void setRents(List<Rent> rent){
		this.rents = rent;
	}
	
	public void addRent(Rent newR){
		this.getRents().add(newR);
	}
	
	public void setPlageNum(String num){
		this.plageNumber=num;
	}
	
	public String getNameV(){
		return nameV;
	}
	
	public void setNameV(String name){
		this.nameV = name;
	}
	
	public boolean isRented(){
		return this.isRented;		
	}
	
	public void setRend(boolean rent){
		this.isRented = rent;
	}
}
