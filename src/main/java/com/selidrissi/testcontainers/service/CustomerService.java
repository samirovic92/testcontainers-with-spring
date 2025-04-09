package com.selidrissi.testcontainers.service;

import com.selidrissi.testcontainers.repository.CustomerEntity;
import com.selidrissi.testcontainers.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public String createCustomer(Customer customer) {
        var entity = new CustomerEntity(customer.getName(), customer.getEmail());
        customerRepository.save(entity);
        return entity.getId().toString();
    }
}
