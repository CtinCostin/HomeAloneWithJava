package main.java.com.georgescuconstantin.designpatterns.behaviorals.command.commands;


import main.java.com.georgescuconstantin.designpatterns.behaviorals.command.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
