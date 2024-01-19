package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.constants.CalculatorServiceTestsConstants.*;

class CalculatorServiceTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnDefaultGreetingsMessage() {
        String result = out.greeting();
        Assertions.assertEquals(greeting_message, result);
    }

    @Test
    public void shouldReturnCorrectSumResult() {
        String result = out.sum(num1, num2);
        String result2 = out.sum(num3, num4);
        Assertions.assertEquals(createSumMessage(num1, num2), result);
        Assertions.assertEquals(createSumMessage(num3, num4), result2);
    }

    @Test
    public void shouldReturnCorrectMinusResult() {
        String result = out.minus(num1, num2);
        String result2 = out.minus(num3, num4);
        Assertions.assertEquals(createMinusMessage(num1, num2), result);
        Assertions.assertEquals(createMinusMessage(num3, num4), result2);
    }

    @Test
    public void shouldReturnCorrectMultiplyResult() {
        String result = out.multiply(num1, num2);
        String result2 = out.multiply(num3, num4);
        Assertions.assertEquals(createMultiplyMessage(num1, num2), result);
        Assertions.assertEquals(createMultiplyMessage(num3, num4), result2);
    }

    @Test
    public void shouldReturnCorrectDivideResult() {
        String result = out.divide(num1, num2);
        String result2 = out.divide(num3, num4);
        Assertions.assertEquals(createDivideMessage(num1, num2), result);
        Assertions.assertEquals(createDivideMessage(num3, num4), result2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionInDivideMethodWhenNum_0() {
        assertThrows(IllegalArgumentException.class,
                () -> out.divide(num3, num_zero)
        );
    }
}