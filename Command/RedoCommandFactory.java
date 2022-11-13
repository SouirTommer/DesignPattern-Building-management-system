package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class RedoCommandFactory implements CommandFactory {
    private Stack commands;
    private Stack redos;
    private Caretaker caretaker;

    public RedoCommandFactory(Stack commands, Stack redos, Caretaker caretaker) {
        this.commands = commands;
        this.redos = redos;
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
        return new RedoCommand(commands, redos, caretaker);
    }

}