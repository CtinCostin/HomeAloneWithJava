package main.java.com.georgescuconstantin.designpatterns.behaviorals.command.commands;

import main.java.com.georgescuconstantin.designpatterns.behaviorals.command.editor.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
