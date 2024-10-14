package assignment3.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<TextMemento> savedStates;

    public Caretaker(){
        savedStates = new ArrayList<>();
    }

    public void addSavedState(TextMemento savedState) {
        savedStates.add(savedState);
    }

    public TextMemento getSavedState(int index) {
        return savedStates.get(index);
    }
}
