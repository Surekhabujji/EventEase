package com.example.eventease.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Booking date is required")
    private LocalDate bookingDate;

    @Positive(message = "Total amount must be greater than zero")
    private Double totalAmount;

    @NotBlank(message = "Booking status is required")
    private String bookingStatus;
}