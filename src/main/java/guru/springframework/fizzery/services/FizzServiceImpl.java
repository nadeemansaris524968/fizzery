package guru.springframework.fizzery.services;

import guru.springframework.fizzery.web.model.FizzDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public FizzDto saveNewFizz(FizzDto fizzDto) {
        return FizzDto.builder()
                .id(UUID.randomUUID())
                .fizzName(fizzDto.getFizzName())
                .build();
    }

    @Override
    public void updateFizz(UUID fizzId, FizzDto fizzDto) {

    }

    @Override
    public void deleteById(UUID fizzId) {
        log.debug("Deleting fizz ...");
    }
}
