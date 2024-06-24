package br.com.stapassoli.learnMapStruct.controller;

import br.com.stapassoli.learnMapStruct.dto.CarDTO;
import br.com.stapassoli.learnMapStruct.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/{id}")
    public ResponseEntity<CarDTO> getCarBy(@PathVariable Long id) {
        return ResponseEntity.ok(carService.getCar(id));
    }

}
