package main.java.com.georgescuconstantin.designpatterns.solid.openclose;

import java.security.InvalidParameterException;

public class SimpleCalculator implements Calculator {

    @Override
    public void calculate(Operation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Invalid operation!");
        }

        operation.doOperation();
    }
}
