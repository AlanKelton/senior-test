package com.validation.senior_test.controller;

import com.validation.senior_test.model.InsuranceContractListErrorItem;
import com.validation.senior_test.model.InsuranceContractRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsuranceContractController {

    public List<InsuranceContractListErrorItem> executeScript(@RequestBody InsuranceContractRequest request) {
        return null;
    }
}
