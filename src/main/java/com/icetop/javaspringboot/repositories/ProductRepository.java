package com.icetop.javaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icetop.javaspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
