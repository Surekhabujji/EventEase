package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}