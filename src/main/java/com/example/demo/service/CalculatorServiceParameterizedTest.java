package com.example.demo.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.calculator.constants.CalculatorServiceTestsConstants.*;

public class CalculatorServiceParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    @Test
    public void shouldReturnDefaultGreetingsMessage() {
        String result = out.greeting();
        Assertions.assertEquals(greeting_message, result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectSumResult(Double NUM1,Double NUM2) {
        String result = out.sum(num1, num2);
        Assertions.assertEquals(createSumMessage(num1,num2), result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectMinusResult(Double num1,Double num2) {
        String result = out.minus(num1, num2);
        Assertions.assertEquals(createMinusMessage(num1,num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectMultiplyResult(Double num1,Double num2) {
        String result = out.multiply(num1, num2);
        Assertions.assertEquals(createMultiplyMessage(num1,num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectDivideResult(Double num1,Double num2) {
        String result = out.divide(num1, num2);
        Assertions.assertEquals(createDivideMessage(num1,num2), result);
    }


    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3,num4)
        );
    }
}
