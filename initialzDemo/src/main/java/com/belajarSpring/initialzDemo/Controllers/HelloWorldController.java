package com.belajarSpring.initialzDemo.Controllers;

import com.belajarSpring.initialzDemo.Entity.Username;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    // mengambil value dari url
    // PathVariable
    @GetMapping("/HelloWorld/{name}")
    public String helloWorldName(@PathVariable(value = "name") String name){
        return "hello" + name;
    }

    // param
    // Postman : www encoded, buka di body
    @PostMapping("/HelloWorld")
    public String helloWorldPost(@RequestParam(name = "username") String username){
        return "hello " + username + ". Have a nice day";
    }

    // Postman : raw dan json, buka di body
    @PostMapping("/HelloWorldUser")
    public Username helloWorldUserPostController(@Valid @RequestBody Username username){
        return username;
    }

    // menggunakan entity
}
