package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}