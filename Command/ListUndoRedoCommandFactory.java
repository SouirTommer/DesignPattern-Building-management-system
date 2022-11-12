package Command;

import java.util.*;

public class ListUndoRedoCommandFactory implements CommandFactory {
    Stack commands;
    Stack redos;

    public ListUndoRedoCommandFactory(Stack commands, Stack redos) {
        this.commands = commands;
        this.redos = redos;
    }

    public Command createCommand() {
        return new ListUndoRedoCommand(commands, redos);
    }

}
