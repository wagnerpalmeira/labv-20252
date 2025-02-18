package com.aula.accountms.repository;

import com.aula.accountms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepository extends
        JpaRepository<Customer, UUID> {
}
