package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Command command;
    Stack commands;

    public CreateBuildingCommand(Scanner sc, HashMap<Integer, Building> buildMap,Stack commands) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
    }

    public void execute() {

        System.out.println("Enter Building Type (a=Apartment/h=House):");
        String Userinput = sc.nextLine();

        switch (Userinput) {
            case "a":
                command = new CreateApartmentCommandFactory(sc, buildMap, commands).createCommand();
                command.execute();
                break;

            case "h":
                command = new CreateHouseCommandFactory(sc, buildMap,commands).createCommand();
                command.execute();
                break;
        }
    }

    public void undo() {

    }

    public void redo() {

    }

}
