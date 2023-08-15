package main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.button;

public class WinButton implements Button{

    @Override
    public void paint() {
        System.out.println("paint windows button");
    }
}
