package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}