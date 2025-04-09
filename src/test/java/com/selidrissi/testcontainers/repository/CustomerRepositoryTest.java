package com.selidrissi.testcontainers.repository;

import com.selidrissi.testcontainers.config.AbstractIntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class CustomerRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        customerRepository.deleteAll();
    }

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