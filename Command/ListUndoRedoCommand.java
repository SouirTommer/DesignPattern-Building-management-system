package Command;

import java.util.*;
import Memento.*;

public class ListUndoRedoCommand implements Command {
    Caretaker caretaker;

    public ListUndoRedoCommand(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public void execute() {
        System.out.println("");
        System.out.println("Undo List :");
        if (!caretaker.getunCommand().isEmpty()) {
            Iterator iter = caretaker.getunCommand().iterator();

            while (iter.hasNext()) {
                String m = (String) iter.next();
                System.out.println(m);
            }
        } else {
            System.out.println("Nothing in Undo List");
        }
        System.out.println("");

        System.out.println("Redo List :");
        if (!caretaker.getreCommand().isEmpty()) {
            Iterator iter = caretaker.getreCommand().iterator();

            while (iter.hasNext()) {
                String m = (String) iter.next();
                System.out.println(m);
            }
        } else {
            System.out.println("Nothing in Redo List");
        }

    }

    public void undo() {

    }

    public void redo() {

    }

}
