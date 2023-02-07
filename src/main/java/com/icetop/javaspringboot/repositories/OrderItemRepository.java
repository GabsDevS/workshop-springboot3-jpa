package com.icetop.javaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icetop.javaspringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
