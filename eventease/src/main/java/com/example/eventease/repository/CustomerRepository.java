package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}