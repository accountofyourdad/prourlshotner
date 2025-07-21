package com.url.shortner.controller;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class UrlMapping {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;			// there are two long and Long so best performance by long and this Long stores the null value
	private int clickCount = 0;
	private String originalUrl;
	private String shortUrl;
//	private BigInteger UserId;					this should not be there as it is the col from the user so to be mapped separately
	private LocalDateTime createdDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id")			//mapped to user.id
	private User user;
	
	@OneToMany(mappedBy = "urlMapping")			// one to many mapped by urlmapping var in clickevent
	private List<ClickEvent> clickEvent;
}
