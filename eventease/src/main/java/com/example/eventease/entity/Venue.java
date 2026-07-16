package com.example.eventease.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "venues")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Venue Name is required")
    private String venueName;

    @NotBlank(message = "Location is required")
    private String location;

    @Positive(message = "Capacity must be greater than zero")
    private Integer capacity;

    @Positive(message = "Price must be greater than zero")
    private Double price;

    private String imageUrl;
}