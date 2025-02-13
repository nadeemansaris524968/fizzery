package guru.springframework.fizzery.services;

import guru.springframework.fizzery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
