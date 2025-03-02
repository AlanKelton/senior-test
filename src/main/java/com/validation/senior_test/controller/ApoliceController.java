package com.validation.senior_test.controller;

import com.validation.senior_test.model.ApoliceListErrorItem;
import com.validation.senior_test.model.ApoliceRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApoliceController {

    public List<ApoliceListErrorItem> executeScript(@RequestBody ApoliceRequest request) {
        return null;
    }
}
