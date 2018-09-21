package com.hvl.dat25018g13.auction.project.entity;

import javax.persistence.Entity;

@Entity
public class Address {
	
	String country;
	String province;
	String city;
	short zipCode;
	String streetName;
	short floor;

}
