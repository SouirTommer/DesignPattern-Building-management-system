package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class UndoCommandFactory implements CommandFactory {
    private Stack commands;
    private Stack redos;

    public UndoCommandFactory(Stack commands, Stack redos) {
        this.commands = commands;
        this.redos = redos;
    }

    @Override
    public Command createCommand() {
        return new UndoCommand(commands, redos);
    }

}