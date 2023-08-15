package main.java.com.georgescuconstantin.designpatterns.solid.openclose;

public class Addition implements Operation{

    private int firstNumber;
    private int secondNumber;
    private int result = 0 ;

    public Addition(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void doOperation() {
        this.result = this.firstNumber + this.secondNumber;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", result=" + result +
                '}';
    }
}
