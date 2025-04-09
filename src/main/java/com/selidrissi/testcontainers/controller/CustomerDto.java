package com.selidrissi.testcontainers.controller;

import com.selidrissi.testcontainers.service.Customer;

public record CustomerDto(
        String name,
        String email
) {
    public Customer toDomain() {
        return new Customer(name, email);
    }
}
