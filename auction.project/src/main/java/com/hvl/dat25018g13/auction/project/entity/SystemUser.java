package com.hvl.dat25018g13.auction.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SystemUser {
	@Id
	String email;
	String password;
	SystemUserRole role;
	

}
