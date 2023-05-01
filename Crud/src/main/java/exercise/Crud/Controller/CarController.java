package exercise.Crud.Controller;

import exercise.Crud.Entity.Car;
import exercise.Crud.Repository.carRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private carRepository carRepository;

    @PostMapping("/create")
    public Car createCar(@RequestBody Car car) {
        Car carSaved = carRepository.saveAndFlush(car);

        return carSaved;
    }

    @GetMapping("/return")
    public List<Car> allCar() {
        List<Car> carList = carRepository.findAll();
        return carList;
    }

    @GetMapping("/return/{id}")
    public Optional<Car> getCar(@PathVariable int id) {

        if (carRepository.existsById(id)) {
            return carRepository.findById(id);
        }else{
            return null;
        }

    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable int id, @RequestBody Car car) {

        if (carRepository.existsById(id)) {
            car.setId(id);
            Car newCar = carRepository.saveAndFlush(car);
            return newCar;
        } else {
            return null;
        }

    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteCar(@PathVariable int id) {

        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return HttpStatus.NO_CONTENT;
        } else {
            return HttpStatus.CONFLICT;
        }

    }

    @DeleteMapping("/deleteAll")
    public String deleteAllCar(){
        carRepository.deleteAll();
        return "all car delete";
    }
}
