package main.java.com.georgescuconstantin.complexnumber;

public class Operations {

    private float complexNumber1;
    private float complexNumber2;
    private float sum;
    private float product;


    public void add(float re , float im){
        complexNumber1 = re + im;
        complexNumber2 = re + im;
        sum = complexNumber1 + complexNumber2;
        System.out.println("Sum of two complex numbers is : " + sum);

    }

    public void multiply(float re , float im){
        complexNumber1 = re + im;
        complexNumber2 = re + im;
        product = complexNumber1 * complexNumber2;
        System.out.println("Product of two complex numbers is : " + product);

    }

}
