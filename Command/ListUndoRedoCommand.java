package Command;

import java.util.*;
import Memento.*;

import javax.print.event.PrintEvent;
import javax.swing.event.SwingPropertyChangeSupport;

import Building.Apartment;

public class ListUndoRedoCommand implements Command {
    Stack commands;
    Stack redos;
    Caretaker caretaker;

    public ListUndoRedoCommand(Stack commands, Stack redos, Caretaker caretaker) {
        this.commands = commands;
        this.redos = redos;
        this.caretaker = caretaker;
    }

    public void execute() {
        System.out.println("Undo List：");
        // if(!commands.isEmpty()){
        // System.out.println(commands.toString());
        // }else{
        // System.out.println("Empty Undo List");
        // }

        if (!caretaker.getunCommand().isEmpty()) {
            System.out.println(caretaker.getunCommand());
        } else {
            System.out.println("Empty Undo List");
        }

        System.out.println("");
        System.out.println("Redo List：");
        if (!caretaker.getreCommand().isEmpty()) {
            System.out.println(caretaker.getreCommand());
        } else {
            System.out.println("Empty Redo List");
        }

    }

    public void undo() {

    }

    public void redo() {

    }

}
