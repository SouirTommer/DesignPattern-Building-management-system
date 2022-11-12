package Command;

import java.util.*;

public class ListUndoRedoCommand implements Command {
    Stack commands;
    Stack redos;

    public ListUndoRedoCommand(Stack commands, Stack redos) {
        this.commands = commands;
        this.redos = redos;
    }

    public void execute() {
        System.out.println("Undo List：");
        if(!commands.isEmpty()){
            System.out.println(commands.toString());
        }else{
            System.out.println("Empty Undo List");
        }

        System.out.println("");
        System.out.println("Redo List：");
        if(!redos.isEmpty()){
            System.out.println(redos.toString());
        }else{
            System.out.println("Empty Redo List");
        }
        
    }

    public void undo() {

    }

    public void redo() {

    }

}
