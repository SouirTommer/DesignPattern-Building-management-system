/*
Last Edit  13/11/2022
*/
package Command;

import Memento.*;

public class UndoCommandFactory implements CommandFactory {
    private Caretaker ct;

    public UndoCommandFactory(Caretaker ct) {
        this.ct = ct;
    }

    @Override
    public Command createCommand() {
        return new UndoCommand(ct);
    }

}