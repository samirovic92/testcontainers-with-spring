package com.selidrissi.testcontainers.service;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
