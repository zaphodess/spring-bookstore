package com.wildcodeschool.spring.bookstore.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String model;
	
	@ManyToMany(mappedBy = "cars", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Customer> customers = new ArrayList<>();
	
	@OneToMany(mappedBy = "car", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Transportation> transportations;

}
