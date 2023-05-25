package exercise.uploadanddownload.controller;

import exercise.uploadanddownload.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/create")
    public void create(){

    }
    @GetMapping
    public void getAll(){

    }
    @GetMapping("/{id}")
    public void getOne(){

    }
    @PutMapping("/{id}")
    public void update(){

    }

    @DeleteMapping("/{id}")
    public void delete(){

    }
}
