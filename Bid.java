package com.hvl.dat25018g13.auction.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Bid implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	double amount;
	Date timePlaced;
	
	@ManyToOne
	Auction auction;
	
	@OneToOne
	User ower;
	
}
