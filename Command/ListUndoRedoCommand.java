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
<<<<<<< HEAD
        // if(!commands.isEmpty()){
        // System.out.println(commands.toString());
        // }else{
        // System.out.println("Empty Undo List");
        // }

        if (!caretaker.getunCommand().isEmpty()) {
            System.out.println(caretaker.getunCommand());
=======
        if (!commands.isEmpty()) {
            Iterator<Command> iter = commands.iterator();
            while (iter.hasNext()) {
                Command c = iter.next();
                if (c instanceof CreateApartmentCommand) {
                    System.out.println("Add Building : "+((CreateApartmentCommand) c).getApartment().toString());
                }
                if (c instanceof CreateHouseCommand) {
                    System.out.println("Add Building : "+((CreateHouseCommand) c).getHouse().toString());
                }
            }
>>>>>>> 1b209cbe7108b28c5f6fe306eadcb987a07c3982
        } else {
            System.out.println("Empty Undo List");
        }

        System.out.println("");
        System.out.println("Redo List：");
<<<<<<< HEAD
        if (!caretaker.getreCommand().isEmpty()) {
            System.out.println(caretaker.getreCommand());
=======
        if (!redos.isEmpty()) {
            Iterator<Command> iter = redos.iterator();
            while (iter.hasNext()) {
                Command c = iter.next();
                if (c instanceof CreateApartmentCommand) {
                    System.out.println("Add Building : "+((CreateApartmentCommand) c).getApartment().toString());
                }
                if (c instanceof CreateHouseCommand) {
                    System.out.println("Add Building : "+((CreateHouseCommand) c).getHouse().toString());
                }
            }
>>>>>>> 1b209cbe7108b28c5f6fe306eadcb987a07c3982
        } else {
            System.out.println("Empty Redo List");
        }

    }

    public void undo() {

    }

    public void redo() {

    }

}
