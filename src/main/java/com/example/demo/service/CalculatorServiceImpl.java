package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greeting() {//реализация (переопределение) метода приветствия
        return "Добро пожаловать в калькулятор!";
    }
    @Override
    public String sum(Double num1, Double num2) {//реализация (переопределение) метода сложения
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Double num1, Double num2) {//реализация (переопределение) метода вычитания
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    @Override
    public String multiply(Double num1, Double num2) {//реализация (переопределение) метода умножения
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override
    public String divide(Double num1, Double num2) {//реализация (переопределение) метода деления
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }



    }
}
