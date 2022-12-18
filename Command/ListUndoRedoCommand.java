/*
Last Edit  13/11/2022
*/
package Command;

import java.util.*;
import Memento.*;

public class ListUndoRedoCommand implements Command {
    private Caretaker ct;
    private Iterator iter;

    public ListUndoRedoCommand(Caretaker ct) {
        this.ct = ct;
    }

    public void execute() {
        System.out.println("");
        System.out.println("Undo List :");
        
        if (!ct.getundoCommand().isEmpty()) {
            iter = ct.getundoCommand().iterator();
            while (iter.hasNext()) {
                String m = (String) iter.next();
                System.out.println(m);
            }
        } else {
            System.out.println("Nothing in Undo List");
        }
        System.out.println("");

        System.out.println("Redo List :");
        if (!ct.getredoCommand().isEmpty()) {
            iter = ct.getredoCommand().iterator();

            while (iter.hasNext()) {
                String m = (String) iter.next();
                System.out.println(m);
            }
        } else {
            System.out.println("Nothing in Redo List");
        }

    }

}
