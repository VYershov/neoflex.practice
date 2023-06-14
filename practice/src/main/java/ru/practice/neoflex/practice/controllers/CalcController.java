package ru.practice.neoflex.practice.controllers;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    public int GetPlus(@PathVariable("a") int a, @PathVariable("b") int b){

        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public int GetMinus(@PathVariable("a") int a, @PathVariable("b") int b){

        return a - b;
    }
}
