package com.calculator.controller;

import com.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CalculatorController {

    CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    private int add(@RequestParam int a,@RequestParam int b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    private int subtract(@RequestParam int a, @RequestParam int b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    private int multiply(@RequestParam int a, @RequestParam int b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    private int divide(@RequestParam int a, @RequestParam int b) {
        return calculatorService.divide(a, b);
    }
}
