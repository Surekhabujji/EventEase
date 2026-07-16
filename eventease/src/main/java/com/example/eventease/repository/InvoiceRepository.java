package com.example.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventease.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}