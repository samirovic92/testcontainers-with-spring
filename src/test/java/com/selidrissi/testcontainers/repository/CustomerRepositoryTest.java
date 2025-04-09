package com.selidrissi.testcontainers.repository;

import com.selidrissi.testcontainers.config.AbstractIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void save_new_customer() {
        // Given
        var customer = new CustomerEntity("sam", "sam@gmail.com");

        // When
        var savedCustomer = customerRepository.save(customer);

        // Then
        assertNotNull(savedCustomer);
    }


}