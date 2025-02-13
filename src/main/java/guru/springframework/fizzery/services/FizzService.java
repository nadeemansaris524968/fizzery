package guru.springframework.fizzery.services;

import guru.springframework.fizzery.web.model.FizzDto;

import java.util.UUID;

public interface FizzService {
    FizzDto getFizzById(UUID fizzId);
}
