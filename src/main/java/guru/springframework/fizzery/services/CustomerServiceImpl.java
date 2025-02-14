package guru.springframework.fizzery.services;

import guru.springframework.fizzery.web.model.CustomerDto;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDto save(CustomerDto dto) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .name(dto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer...");
    }
}
