package com.validation.senior_test.model;

import java.time.LocalDateTime;

public class Claim {

    private Long id;

    private String description;
    private LocalDateTime eventDate;
    private Double financialLoss;

    private InsuranceContract insuranceContract;
}
