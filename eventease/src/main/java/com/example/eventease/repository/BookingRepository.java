package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}