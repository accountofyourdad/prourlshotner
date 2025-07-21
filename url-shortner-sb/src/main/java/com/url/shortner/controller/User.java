package com.url.shortner.controller;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table( name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;			// here is long so we will be using long at repository of jparepo<class, long> if this would be bigint than this will be bigint
	private String email;
	private String pass;
	private String role;
	private String username = "Normal";
	
}
