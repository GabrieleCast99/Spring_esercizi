package co.develhope.customqueries1.controllers;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.entities.FlightStatus;
import co.develhope.customqueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/flights")
public class FlightController {

@Autowired
    private FlightRepository flightRepository;





    @GetMapping("/all")
    public List<Flight> getAll(){
    return flightRepository.findAll();
}





    @GetMapping("/all/fromAirport")
    public Page<Flight> getAll(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size,
                               @RequestParam(defaultValue = "fromAirport") String sortBy){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
        return flightRepository.findAll(pageable);
    }



    @PostMapping("/create")
    public List<Flight> createFlights() {
        List<Flight> flights = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Flight flight = new Flight();
            flight.setDescription(generateRandomString());
            flight.setFromAirport(generateRandomString());
            flight.setToAirport(generateRandomString());
            flight.setStatus(FlightStatus.randomLetter());
            flights.add(flight);
        }

        return flightRepository.saveAll(flights);
    }



    private String generateRandomString(){
    int leftLimit= 97; // lettera a
    int rightLimit=122; // lettera z
        int stringLenght = 10;
        Random random= new Random();
        String generatedString = random.ints(leftLimit, rightLimit )
                .limit(stringLenght)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }


    @GetMapping("/all/ONTIME")
    public List<Flight> getAllOnTimeFlights() {
        Specification<Flight> spec = Specification.where((root, query, cb) ->
                cb.equal(root.get("status"), FlightStatus.ONTIME));
        return flightRepository.findAll(spec);}

    @GetMapping("/status")
    public List<Flight> getFlightsByStatus(@RequestParam String p1, @RequestParam String p2) {
        return flightRepository.findByStatusIn(p1, p2);
    }
}
