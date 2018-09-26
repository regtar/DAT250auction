package com.hvl.dat25018g13.auction.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SystemUser {
	@Id
	String email;
	String password;
	SystemUserRole role;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		SystemUser other = (SystemUser) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (role != other.role)
			return false;
		return true;
	}
	

}
