package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Booking;

public interface BookingServiceRepository extends JpaRepository<Booking, Long> {

}
