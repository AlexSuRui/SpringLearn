package com.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Van extends Vehicule{

	float maxWeight;
	
	public Van(){
		super();
		this.type = "Van";	}
	
	@Id
	public float getmaxWeight(){
		return maxWeight;
	}
	
	public void setmaxWeight(float newWeight){
		this.maxWeight = newWeight;
	}
}
