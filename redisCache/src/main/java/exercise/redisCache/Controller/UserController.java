package exercise.redisCache.Controller;

import exercise.redisCache.Entity.Jpa.UserJPA;
import exercise.redisCache.Entity.User;
import exercise.redisCache.Services.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public UserJPA create(@RequestBody UserJPA user){
        return userService.create(user);
    }

    @GetMapping()
    public List<UserJPA> readAll(){
        return userService.readAll();
    }

    @GetMapping("/{id}")
    public UserJPA readOne(@PathVariable Long id){
        return userService.readOne(id);
    }

    @GetMapping("/{id}/fast")
    public void readOneFast(@PathVariable Long id){
        userService.readOneFast(id);
    }

    @PutMapping("/{id}")
    public UserJPA update(@PathVariable Long id, @RequestBody UserJPA user){
        return userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}