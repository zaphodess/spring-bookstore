package com.wildcodeschool.spring.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.spring.bookstore.entity.Transportation;

@Repository
public interface TransportationRepository  extends JpaRepository<Transportation, Long>{

}
