package Command;

import java.util.*;
import Memento.*;

public class ListUndoRedoCommand implements Command {
    Caretaker caretaker;

    public ListUndoRedoCommand(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public void execute() {

    }

    public void undo() {

    }

    public void redo() {

    }

}
