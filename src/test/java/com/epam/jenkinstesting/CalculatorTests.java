package com.epam.jenkinstesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CalculatorTests {

    @InjectMocks
    Calculator calculator;

    @Test
    void addTwoNumbersTest() {
        assertEquals(2,calculator.addTwoNumbers(1,1));
    }

    @Test
    void subtractTwoNumbersTest() {
        assertEquals(0,calculator.subtractTwoNumbers(1,1));
    }

    @Test
    void multiplyTwoNumbersTest() {
        assertEquals(1,calculator.multiplyTwoNumbers(1,1));
    }

}
