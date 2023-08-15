package main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.checkbox;

public class WinCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("paint windows checkbox");
    }
}
