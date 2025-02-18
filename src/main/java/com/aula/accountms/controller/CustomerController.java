package com.aula.accountms.controller;

import ch.qos.logback.core.net.server.Client;
import com.aula.accountms.model.Customer;
import com.aula.accountms.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Void> save(
            @RequestBody Customer customer) {
        customerService.save(customer);

        return ResponseEntity.ok().build();
    }
}
