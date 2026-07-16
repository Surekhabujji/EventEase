package com.example.eventease.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Event Type is required")
    private String eventType;

    @Future(message = "Event date must be in the future")
    private LocalDate eventDate;

    @NotBlank(message = "Location is required")
    private String location;

    @Positive(message = "Guest count must be greater than zero")
    private Integer guestCount;

    @Positive(message = "Budget must be greater than zero")
    private Double budget;

    private String status;
}