package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {

}