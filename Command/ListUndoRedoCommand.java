package Command;

import java.util.*;

import javax.print.event.PrintEvent;
import javax.swing.event.SwingPropertyChangeSupport;

import Building.Apartment;

public class ListUndoRedoCommand implements Command {
    Stack commands;
    Stack redos;

    public ListUndoRedoCommand(Stack commands, Stack redos) {
        this.commands = commands;
        this.redos = redos;
    }

    public void execute() {
        System.out.println("Undo List：");
        if (!commands.isEmpty()) {
            Iterator<Command> iter = commands.iterator();
            while (iter.hasNext()) {
                Command c = iter.next();
                if (c instanceof CreateApartmentCommand) {
                    System.out.println(((CreateApartmentCommand) c).getApartment().toString());
                }
                if (c instanceof CreateHouseCommand) {
                    System.out.println(((CreateHouseCommand) c).getHouse().toString());
                }
            }
        } else {
            System.out.println("Empty Undo List");
        }

        System.out.println("");
        System.out.println("Redo List：");
        if (!redos.isEmpty()) {
            Iterator<Command> iter = redos.iterator();
            while (iter.hasNext()) {
                Command c = iter.next();
                if (c instanceof CreateApartmentCommand) {
                    System.out.println(((CreateApartmentCommand) c).getApartment().toString());
                }
                if (c instanceof CreateHouseCommand) {
                    System.out.println(((CreateHouseCommand) c).getHouse().toString());
                }
            }
        } else {
            System.out.println("Empty Redo List");
        }

    }

    public void undo() {

    }

    public void redo() {

    }

}
