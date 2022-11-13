package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Command command;
    Stack commands;
    Caretaker caretaker;

    public CreateBuildingCommand(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.caretaker = caretaker;
    }

    public void execute() {

        System.out.println("Enter Building Type (a=Apartment/h=House):");
        String Userinput = sc.nextLine();

        switch (Userinput) {
            case "a":
                command = new CreateApartmentCommandFactory(sc, buildMap, commands, caretaker).createCommand();
                command.execute();
                break;

            case "h":
                command = new CreateHouseCommandFactory(sc, buildMap, commands, caretaker).createCommand();
                command.execute();
                break;
        }
    }

    public void undo() {

    }

    public void redo() {

    }

}
