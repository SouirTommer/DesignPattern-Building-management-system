package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class UndoCommandFactory implements CommandFactory {
    private Stack commands;
    private Stack redos;
    Caretaker caretaker;

    public UndoCommandFactory(Stack commands, Stack redos, Caretaker caretaker) {
        this.commands = commands;
        this.redos = redos;
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
        return new UndoCommand(commands, redos, caretaker);
    }

}