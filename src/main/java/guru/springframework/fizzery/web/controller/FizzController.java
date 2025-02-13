package guru.springframework.fizzery.web.controller;

import guru.springframework.fizzery.services.FizzService;
import guru.springframework.fizzery.web.model.FizzDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/fizz")
@RestController
public class FizzController {

    private final FizzService fizzService;

    @Autowired
    public FizzController(FizzService fizzService) {
        this.fizzService = fizzService;
    }

    @GetMapping("/{fizzId}")
    public ResponseEntity<FizzDto> getFizz(@PathVariable("fizzId") UUID fizzId) {
        return new ResponseEntity<>(fizzService.getFizzById(fizzId), HttpStatus.OK);
    }
}
