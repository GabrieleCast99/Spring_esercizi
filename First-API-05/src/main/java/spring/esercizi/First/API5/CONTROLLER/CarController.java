package spring.esercizi.First.API5.CONTROLLER;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.esercizi.First.API5.DTO.CarDTO;

@RestController
@RequestMapping("/cars")
public class CarController {
    @GetMapping
    public CarDTO getCar() {
        CarDTO car = new CarDTO();
        car.setId("1");
        car.setModelName("Fiat");
        car.setPrice(1000.0);
        return car;
    }

    @PostMapping
    public ResponseEntity<String> createCar(@RequestBody CarDTO car){
        if(car.getId()==null||car.getModelName()==null){
            return ResponseEntity.badRequest().body("Bad request, id or model is null");

        }

        return ResponseEntity.status(HttpStatus.CREATED).body("Car is correct created:  "+car);
    }

}
