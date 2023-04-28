package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/math")
    public String welcomeMathMsg(){
        return "Hii this is my Math API";
    }

    @GetMapping("/math/division-info")
    public ArithmeticOperation divisionInfo(){
        return new ArithmeticOperation("division",2,"a/b=c",new String[]{"anticommutativa","non associativa"});
    }

    @GetMapping("/math/multiplication")
    public int multiplication(@RequestParam int a, @RequestParam int b){
        return a * b;
    }

    @GetMapping("/math/square/{n}")
    public int square(@PathVariable int n){
        return n * n;
    }

}