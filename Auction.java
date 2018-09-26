package com.hvl.dat25018g13.auction.project.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public abstract class Auction implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	String productName;
	
	double rating;
	
	Date startDate;
	
	Date endDate;
	
	Boolean published;
	
	
	@ManyToOne
	User owner;

	@ManyToMany
	List<Category> category;
	
	@OneToMany
	List<Bid> bid;
	
	@OneToOne
	Feedback feedback;
	
	abstract Bid getHighetBid();
	
	abstract User getOwer();
	
	abstract Date getStarTime();
	
	abstract Date getEndTime();
	
	abstract List<Bid> getAllBids();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auction other = (Auction) obj;
		if (bid == null) {
			if (other.bid != null)
				return false;
		} else if (!bid.equals(other.bid))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id != other.id)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	

}
