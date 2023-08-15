package main.java.com.georgescuconstantin.complexnumber;

public class ComplexNumber {

    private float re;
     private float im;

    public ComplexNumber(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public float getRe() {
        return re;
    }

    public float getIm() {
        return im;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public void setIm(float im) {
        this.im = im;
    }
}
