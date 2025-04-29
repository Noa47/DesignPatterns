package Behavioral.Memento;
import Behavioral.Memento.TextArea.Memento;
import java.util.LinkedList;

public class Editor {

    private final TextArea textArea;
    private final LinkedList<Memento> stateHistory;
    private final LinkedList<Memento> redoHistory;
    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<>();
        redoHistory = new LinkedList<>();
    }
    public void write(String text) {
        textArea.set(text);
        stateHistory.offer(textArea.takeSnapshot());
        redoHistory.clear(); 
    }
    
    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        Memento lastState = stateHistory.pollLast();
        redoHistory.offer(lastState);
        textArea.restore(stateHistory.peekLast());
    }

    public void redo() {
        if (redoHistory.isEmpty()) {
            return;
        }
        Memento redoState = redoHistory.pollLast();
        stateHistory.offer(redoState); 
        textArea.restore(redoState);
    }

    public void printText() {
        System.out.println(textArea.getText());
    }

}
