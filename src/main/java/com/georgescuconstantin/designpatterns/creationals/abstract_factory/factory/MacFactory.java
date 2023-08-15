package main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.factory;

import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.button.Button;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.button.MacButton;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.checkbox.Checkbox;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
