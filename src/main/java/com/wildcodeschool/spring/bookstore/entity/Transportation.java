package com.wildcodeschool.spring.bookstore.entity;

import javax.persistence.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Transportation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime transportationStart;
	
	private LocalDateTime transportationEnd;
	
	@ManyToOne
	@JoinColumn
	@NotNull	
	private Customer passenger;
	
	@ManyToOne
	@JoinColumn(name="car_id",referencedColumnName ="id")
	@NotNull	
	private Car car;
}
