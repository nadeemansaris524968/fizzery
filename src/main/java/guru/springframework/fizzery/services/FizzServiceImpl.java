package guru.springframework.fizzery.services;

import guru.springframework.fizzery.web.model.FizzDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FizzServiceImpl implements FizzService {
    @Override
    public FizzDto getFizzById(UUID fizzId) {
        return FizzDto.builder()
                .id(UUID.randomUUID())
                .fizzName("FizzBurp")
                .fizzStyle("FizzAle")
                .build();
    }
}
