package com.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	long id;
	String name;
	private List<Rent> rents = new ArrayList<Rent>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId(){
		return id;
	}
	
	@OneToMany(cascade=(CascadeType.REMOVE),mappedBy="person")
	public List<Rent> getRents(){
		return rents;
	}
	public void setRents(List<Rent> rent){
		this.rents = rent;
	}
	
	public void addRent(Rent newR){
		this.getRents().add(newR);
	}
	public void setId(long newId){
		this.id= newId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		this.name= newName;
	}
	
}
