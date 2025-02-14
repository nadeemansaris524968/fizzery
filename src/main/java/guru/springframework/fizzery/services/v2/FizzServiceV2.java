package guru.springframework.fizzery.services.v2;

import guru.springframework.fizzery.web.model.v2.FizzDtoV2;

import java.util.UUID;

public interface FizzServiceV2 {
    FizzDtoV2 getFizzById(UUID fizzId);

    FizzDtoV2 saveNewFizz(FizzDtoV2 fizzDto);

    void updateFizz(UUID fizzId, FizzDtoV2 fizzDto);

    void deleteById(UUID fizzId);
}
