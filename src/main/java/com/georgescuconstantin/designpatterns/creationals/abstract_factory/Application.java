package main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory;

import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.button.Button;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.checkbox.Checkbox;
import main.java.com.georgescuconstantin.designpatterns.creationals.abstract_factory.factory.GUIFactory;

public class Application {

    private GUIFactory factory;

    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    void paint() {
        button.paint();
        checkbox.paint();
    }
}
