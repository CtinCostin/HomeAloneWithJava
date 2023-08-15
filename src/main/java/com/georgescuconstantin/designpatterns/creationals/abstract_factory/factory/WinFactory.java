package main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.factory;

import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.button.Button;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.button.WinButton;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.checkbox.Checkbox;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.checkbox.WinCheckbox;

public class WinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
