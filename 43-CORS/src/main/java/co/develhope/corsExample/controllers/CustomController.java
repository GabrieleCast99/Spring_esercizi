package co.develhope.corsExample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CustomController {

    @GetMapping("/custom")
    public String getCustomMessage() {
        return "Welcome to the Spring Server!";
    }
}