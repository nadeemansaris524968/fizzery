package guru.springframework.fizzery.web.controller;

import guru.springframework.fizzery.services.FizzService;
import guru.springframework.fizzery.web.model.FizzDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity handlePost(FizzDto fizzDto) {
        FizzDto saved = fizzService.saveNewFizz(fizzDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/fizz/" + saved.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{fizzId}")
    public ResponseEntity handleUpdate(@PathVariable("fizzId") UUID fizzId, FizzDto fizzDto) {
        fizzService.updateFizz(fizzId, fizzDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
