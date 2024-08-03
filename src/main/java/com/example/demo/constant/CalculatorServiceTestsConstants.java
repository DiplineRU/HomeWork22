package com.example.demo.constant;

import java.util.Random;
public class CalculatorServiceTestsConstants {
    static Random r = new Random();
    public static final double num1 = r.nextDouble(-100,100);
    public static final double num2 = r.nextDouble(-100,100);
    public static final double num3 =  r.nextDouble(-100,100);
    public static final double num4 =  r.nextDouble(-100,100);
    public static final double num_zero = 0;
    public static final String greeting_message = "Добро пожаловать в калькулятор!";


    public static String createSumMessage(Double num1, Double num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    public static String createMinusMessage(Double num1, Double num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    public static String createMultiplyMessage(Double num1, Double num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    public static String createDivideMessage(Double num1, Double num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
