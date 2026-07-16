package com.example.eventease.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "quotations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Quotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Positive(message = "Quotation amount must be greater than zero")
    private Double totalAmount;

    @NotBlank(message = "Quotation status is required")
    private String quotationStatus;

    @NotNull(message = "Generated date is required")
    private LocalDate generatedDate;
}