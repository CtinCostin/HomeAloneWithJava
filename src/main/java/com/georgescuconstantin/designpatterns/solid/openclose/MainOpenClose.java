package main.java.com.georgescuconstantin.designpatterns.solid.openclose;

public class MainOpenClose {

    public static void main(String[] args) {

        Operation addition = new Addition(1,3);
        Operation substraction = new Substraction(5,3);
        Operation multiplication = new Multiplication(5,5);

        Calculator calculator = new SimpleCalculator();
        calculator.calculate(addition);
        calculator.calculate(substraction);
        calculator.calculate(multiplication);



    }
}
