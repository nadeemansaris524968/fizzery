package guru.springframework.fizzery.services.v2;

import guru.springframework.fizzery.web.model.v2.FizzDtoV2;
import guru.springframework.fizzery.web.model.v2.FizzStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FizzServiceV2Impl implements FizzServiceV2 {
    @Override
    public FizzDtoV2 getFizzById(UUID fizzId) {
        return FizzDtoV2.builder()
                .id(UUID.randomUUID())
                .fizzName("FizzBurp")
                .fizzStyle(FizzStyleEnum.ALE)
                .build();
    }

    @Override
    public FizzDtoV2 saveNewFizz(FizzDtoV2 fizzDtoV2) {
        return FizzDtoV2.builder()
                .id(UUID.randomUUID())
                .fizzName(fizzDtoV2.getFizzName())
                .fizzStyle(FizzStyleEnum.IPA)
                .build();
    }

    @Override
    public void updateFizz(UUID fizzId, FizzDtoV2 fizzDtoV2) {

    }

    @Override
    public void deleteById(UUID fizzId) {

    }
}
