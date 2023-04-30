package exercise.MongoDB.Controller;

import exercise.MongoDB.Entity.User;
import exercise.MongoDB.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ControllerUser {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("")
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping
    public List<User> getUser(){
        return userRepo.findAll();
    }

}
