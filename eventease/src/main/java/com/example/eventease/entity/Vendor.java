package com.example.eventease.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "vendors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Business Name is required")
    private String businessName;

    @NotBlank(message = "Service Type is required")
    private String serviceType;

    @NotBlank(message = "City is required")
    private String city;

    @Email(message = "Enter a valid email")
    private String email;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must contain exactly 10 digits")
    private String phone;

    @PositiveOrZero(message = "Experience cannot be negative")
    private Integer experience;

    private Double rating;

    private Boolean availability;
}