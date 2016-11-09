package com.domain;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Rent {

	long Id;
	Date beginRent;
	Date endRent;
	Person person;
	Vehicule vehicule;
	
//	public Rent(Date beginR, Date endR) {
//		// TODO Auto-generated constructor stub
//		this.beginRent = beginR;
//		this.endRent = endR;
//	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId(){
		return Id;
	}
	
	public void setId(long id){
		this.Id = id;
	}
	
	@Temporal (TemporalType.TIMESTAMP)
	public Date getBeginR(){
		return beginRent;
	}
	
	public void setBeginR(Date newDate){
		this.beginRent = newDate;
	}
	@Temporal (TemporalType.TIMESTAMP)
	public Date getEndR(){
		return endRent;
	}
	
	public void setEndR(Date newDate){
		this.endRent = newDate;
	}
	@ManyToOne
	@JsonIgnore
	public Person getPerson(){
		return person;
	}
	
	public void setPerson(Person person){
		this.person = person;
	}
	@ManyToOne
	@JsonIgnore
	public Vehicule getVehicule(){
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule){
		this.vehicule = vehicule;
	}
	
	
	
}
