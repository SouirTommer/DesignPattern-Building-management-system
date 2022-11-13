package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class RedoCommandFactory implements CommandFactory {
    private Caretaker caretaker;

    public RedoCommandFactory(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
        return new RedoCommand(caretaker);
    }

}