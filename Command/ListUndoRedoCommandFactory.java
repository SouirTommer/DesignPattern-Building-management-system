/*
Last Edit  13/11/2022
*/
package Command;

import Memento.*;

public class ListUndoRedoCommandFactory implements CommandFactory {
    private Caretaker ct;

    public ListUndoRedoCommandFactory(Caretaker ct) {
        this.ct = ct;
    }

    public Command createCommand() {
        return new ListUndoRedoCommand(ct);
    }

}
