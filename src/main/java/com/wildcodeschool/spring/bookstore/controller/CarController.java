package com.wildcodeschool.spring.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wildcodeschool.spring.bookstore.entity.Car;
import com.wildcodeschool.spring.bookstore.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
    private CarRepository carRepository;

	@GetMapping("/cars")
	public String getAll(Model model) {
		
		model.addAttribute ("cars", carRepository.findAll());
		
		return "car/get_all";
	}

	@PostMapping("/car/upsert")
	public String upsert(Car car) {
		return null;
	}

	@GetMapping("/car/{id}/delete")
	public String delete(@PathVariable Long id) {
		return "hello cars";
	}

}