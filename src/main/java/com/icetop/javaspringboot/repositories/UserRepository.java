package com.icetop.javaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icetop.javaspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
