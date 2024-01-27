package com.homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    void setUp (){
        calculator = new SumCalculator();
    }

    @Test
    void testSum1() {
        assertEquals(1, SumCalculator.sum(1), "Сумма чисел от 1 до 1 должна быть 1");
    }

    @Test
    void testSum3() {
        assertEquals(6, SumCalculator.sum(3), "Сумма чисел от 1 до 3 должна быть 6");
    }

    @Test
    void testSum2() {
        assertEquals(3, SumCalculator.sum(2), "Сумма чисел от 1 до 2 должна быть 3");
    }

    @Test
    void testSum0() {
        assertThrows(IllegalArgumentException.class, () -> SumCalculator.sum(0), "Должно быть выброшено исключение IllegalArgumentException");
    }
}
