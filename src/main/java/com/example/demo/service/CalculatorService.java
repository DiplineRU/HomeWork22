package com.example.demo.service;

public interface CalculatorService {
    String greeting(); //интерфейс метода приветствия

    String sum(Double num1, Double num2);//интерфейс метода сложения
    String minus(Double num1, Double num2);//интерфейс метода вычитания
    String multiply(Double num1, Double num2);//интерфейс метода умножения
    String divide(Double num1, Double num2);//интерфейс метода деления
}
