package guru.springframework.fizzery.services;

import guru.springframework.fizzery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }
}
