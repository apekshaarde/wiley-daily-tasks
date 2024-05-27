package test;

import com.app.Calculator;

public class CalculatorTest {

    @Test
    void addTest() {
        // Given
        Calculator calc = new Calculator();
        // When

        // Then
        Assertions.assertEquals(0, calc.add(10, -10));
        Assertions.assertEquals(30, calc.add(10, 20));

    }
}