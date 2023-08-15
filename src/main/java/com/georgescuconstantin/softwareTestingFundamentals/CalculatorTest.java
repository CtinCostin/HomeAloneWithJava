package main.java.com.georgescuconstantin.softwareTestingFundamentals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        int result = calculator.addition(5, 15);

        Assertions.assertEquals(20, result);
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtraction(55, 3);

        Assertions.assertEquals(52, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiplication(5, 7);

        Assertions.assertEquals(35, result);
    }

    @Test
    void testDivision() {
        double result = calculator.division(40, 8);

        Assertions.assertEquals(5, result);
    }


}
