package com.hvl.dat25018g13.auction.project.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Feedback {
	@EmbeddedId
	FeedbackId id;
	User bidder;
	Auction auction;
	short rating;
	String comment;
	

}
