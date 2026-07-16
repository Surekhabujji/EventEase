package com.example.eventease.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "services")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Service Name is required")
    private String serviceName;

    @NotBlank(message = "Category is required")
    private String category;

    @Positive(message = "Price must be greater than zero")
    private Double price;

    @NotBlank(message = "Description is required")
    private String description;
}