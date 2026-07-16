package com.example.eventease.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "invoices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Invoice number is required")
    private String invoiceNumber;

    @Positive(message = "Invoice amount must be greater than zero")
    private Double totalAmount;

    @NotNull(message = "Invoice date is required")
    private LocalDate invoiceDate;
}