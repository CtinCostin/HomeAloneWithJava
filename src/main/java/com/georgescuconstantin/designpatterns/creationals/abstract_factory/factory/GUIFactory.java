package main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.factory;

import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.button.Button;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
