package com.selidrissi.testcontainers.controller;

import com.selidrissi.testcontainers.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public String createCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.createCustomer(customerDto.toDomain());
    }
}
