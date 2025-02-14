package guru.springframework.fizzery.web.controller.v2;

import guru.springframework.fizzery.services.v2.FizzServiceV2;
import guru.springframework.fizzery.web.model.v2.FizzDtoV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v2/fizz")
@RestController
public class FizzControllerV2 {

    private final FizzServiceV2 fizzServiceV2;

    @Autowired
    public FizzControllerV2(FizzServiceV2 fizzServiceV2) {
        this.fizzServiceV2 = fizzServiceV2;
    }

    @GetMapping("/{fizzId}")
    public ResponseEntity<FizzDtoV2> getFizz(@PathVariable("fizzId") UUID fizzId) {
        return new ResponseEntity<>(fizzServiceV2.getFizzById(fizzId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody FizzDtoV2 fizzDtoV2) {
        FizzDtoV2 saved = fizzServiceV2.saveNewFizz(fizzDtoV2);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/fizz/" + saved.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{fizzId}")
    public ResponseEntity handleUpdate(@PathVariable("fizzId") UUID fizzId, @RequestBody FizzDtoV2 fizzDtoV2) {
        fizzServiceV2.updateFizz(fizzId, fizzDtoV2);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{fizzId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFizz(@PathVariable("fizzId") UUID fizzId) {
        fizzServiceV2.deleteById(fizzId);
    }
}
