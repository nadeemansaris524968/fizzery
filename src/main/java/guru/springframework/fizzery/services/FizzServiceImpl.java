package guru.springframework.fizzery.services;

import guru.springframework.fizzery.web.model.FizzDto;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FizzServiceImpl implements FizzService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FizzServiceImpl.class);

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
