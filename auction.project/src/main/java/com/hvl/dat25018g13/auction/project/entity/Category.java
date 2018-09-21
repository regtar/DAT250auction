package com.hvl.dat25018g13.auction.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	String name;
	
	String description;
	

}
