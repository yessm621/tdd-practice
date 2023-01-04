package com.tdd.ch02.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void plus() {
        int result = Calculator.plus(1, 2);
        Assertions.assertEquals(3, result);
    }

    static class Calculator {
        public static int plus(int num1, int num2) {
            return num1 + num2;
        }
    }
}
