package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Quotation;

public interface QuotationRepository extends JpaRepository<Quotation, Long> {

}