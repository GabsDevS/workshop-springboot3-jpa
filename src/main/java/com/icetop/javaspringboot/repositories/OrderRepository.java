package com.icetop.javaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icetop.javaspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
