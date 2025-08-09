package com.validation.senior_test.model;

import java.time.LocalDateTime;
import java.util.List;

public class InsuranceContract {

    private Long id;

    private String number;
    private Customer customer;
    private Double totalAmount;
    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private List<Claim> claims;


}