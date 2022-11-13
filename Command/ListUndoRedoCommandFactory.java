package Command;

import java.util.*;
import Memento.*;

public class ListUndoRedoCommandFactory implements CommandFactory {
    Caretaker caretaker;

    public ListUndoRedoCommandFactory(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public Command createCommand() {
        return new ListUndoRedoCommand(caretaker);
    }

}
