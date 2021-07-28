package com.example.hellospring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class HelloSpringApplication {

    static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "Yusepe :)") String name) {
        return String.format("Ciao %s!", name);
    }
    @GetMapping("/web")
    public String hello2(@RequestParam(value = "name", defaultValue = "Yusepe :)") String name) {
        return String.format("Ciao %s!", name);
    }
}
