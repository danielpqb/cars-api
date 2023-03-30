package com.cars.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping
public class CarsController {
    @PostMapping("/api/car")
    public String postCar(@RequestBody CarDTO req) {
        System.out.println(req);
        return "Carro criado com sucesso!";
    }
    
}
