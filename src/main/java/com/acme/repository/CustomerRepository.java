package com.acme.repository;

import java.util.List;

import com.acme.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findById(Long id);

    List<Customer> findByLastName(String lastName);
}