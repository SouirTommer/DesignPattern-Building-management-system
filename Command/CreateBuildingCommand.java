package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Command command;

    public CreateBuildingCommand(Scanner sc, HashMap<Integer, Building> buildMap) {
        this.sc = sc;
        this.buildMap = buildMap;
    }

    public void execute() {

        System.out.println("Enter Building Type (a=Apartment/h=House):");
        String Userinput = sc.nextLine();

        switch (Userinput) {
            case "a":
                command = new CreateApartmentCommand(sc, buildMap);
                command.execute();
                break;

            case "h":
                command = new CreateHouseCommand(sc, buildMap);
                command.execute();
                break;
        }
    }

    public void undo() {

    }

    public void redo() {

    }

}
