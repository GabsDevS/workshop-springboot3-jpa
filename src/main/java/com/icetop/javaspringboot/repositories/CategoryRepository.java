package com.icetop.javaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icetop.javaspringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
