package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class RedoCommandFactory implements CommandFactory {
    private Stack commands;
    private Stack redos;

    public RedoCommandFactory(Stack commands, Stack redos) {
        this.commands = commands;
        this.redos = redos;
    }

    @Override
    public Command createCommand() {
        return new RedoCommand(commands, redos);
    }

}