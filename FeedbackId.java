package com.hvl.dat25018g13.auction.project.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class FeedbackId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User bidder;
	public Auction auction;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auction == null) ? 0 : auction.hashCode());
		result = prime * result + ((bidder == null) ? 0 : bidder.hashCode());
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
		FeedbackId other = (FeedbackId) obj;
		if (auction == null) {
			if (other.auction != null)
				return false;
		} else if (!auction.equals(other.auction))
			return false;
		if (bidder == null) {
			if (other.bidder != null)
				return false;
		} else if (!bidder.equals(other.bidder))
			return false;
		return true;
	}
	
	// TODO implementer Hashcode og equals. 
	

}
