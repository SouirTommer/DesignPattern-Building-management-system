package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class UndoCommandFactory implements CommandFactory {
    Caretaker caretaker;

    public UndoCommandFactory( Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
        return new UndoCommand(caretaker);
    }

}