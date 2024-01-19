package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;
import pro.sky.calculator.service.CalculatorServiceImpl;

@RestController//аннотация для пометки класса-контроллера
@RequestMapping("/calculator")//аннотация для выноса общей части запросов
public class CalculatorController {
    private final CalculatorService calculatorService;//создание переменной типа CalculatorServiceImpl

    public CalculatorController(CalculatorServiceImpl calculatorService) { //конструктор
        this.calculatorService = calculatorService;
    }
    @GetMapping // аннотация для получения запросов типа Get
    public String greeting() { //вызов метода приветствия
        return calculatorService.greeting();
    }

    @GetMapping(path = "/plus")// аннотация для получения запросов типа Get
    public String sum(@RequestParam Double num1, @RequestParam Double num2) {//вызов метода сложения
        if (num1 == null || num2 == null) {
            return "Неверный запрос";
        } else {
            return calculatorService.sum(num1, num2);
        }
    }

    @GetMapping(path = "/minus")// аннотация для получения запросов типа Get
    public String minus(@RequestParam Double num1, @RequestParam Double num2) {//вызов метода вычитания
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")// аннотация для получения запросов типа Get
    public String multiply(@RequestParam Double num1, @RequestParam Double num2) {//вызов метода умножения
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")// аннотация для получения запросов типа Get
    public String divide(@RequestParam Double num1, @RequestParam Double num2) {//вызов метода деления
        return calculatorService.divide(num1, num2);
    }
}

