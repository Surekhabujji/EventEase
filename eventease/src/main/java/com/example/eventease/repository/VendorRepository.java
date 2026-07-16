package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

}