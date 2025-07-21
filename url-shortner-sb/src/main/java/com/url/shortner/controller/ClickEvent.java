package com.url.shortner.controller;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class ClickEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime clickDate;
	
	@ManyToOne
	@JoinColumn(name  = "url_mapping_id")			// this is the column name that is gona be appearing in the DB table
	private UrlMapping urlMapping;					// this will be like the data type it will be holding
}
