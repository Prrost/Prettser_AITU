package assignment3.memento;

public class TextEditor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void addText(String text) {
        this.text += text;
    }

    public void printText() {
        System.out.println(text);
    }

    public TextMemento saveState(){
        return new TextMemento(text);
    }

    public void restoreState(TextMemento memento) {
        this.text = memento.getText();
    }
}
