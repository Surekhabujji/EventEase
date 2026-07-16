package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}