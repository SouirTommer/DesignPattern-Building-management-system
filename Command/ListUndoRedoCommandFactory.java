package Command;

import java.util.*;
import Memento.*;

public class ListUndoRedoCommandFactory implements CommandFactory {
    Stack commands;
    Stack redos;
    Caretaker caretaker;

    public ListUndoRedoCommandFactory(Stack commands, Stack redos, Caretaker caretaker) {
        this.commands = commands;
        this.redos = redos;
        this.caretaker = caretaker;
    }

    public Command createCommand() {
        return new ListUndoRedoCommand(commands, redos, caretaker);
    }

}
