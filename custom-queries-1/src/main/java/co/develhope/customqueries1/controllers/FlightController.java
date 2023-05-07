package co.develhope.customqueries1.controllers;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.entities.FlightStatus;
import co.develhope.customqueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping
    public List<Flight> createFlights() {
        List<Flight> flights = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight();
            flight.setDescription(generateRandomString());
            flight.setFromAirport(generateRandomString());
            flight.setToAirport(generateRandomString());
            flight.setStatus(FlightStatus.ONTIME);
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

}
