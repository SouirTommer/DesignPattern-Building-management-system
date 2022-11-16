/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;

import Memento.*;

public class RedoCommandFactory implements CommandFactory {
    private Caretaker ct;

    public RedoCommandFactory(Caretaker ct) {
        this.ct = ct;
    }

    public Command createCommand() {
        return new RedoCommand(ct);
    }

}