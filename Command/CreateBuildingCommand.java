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

    CommandFactory af;
    CommandFactory hf;

    public CreateBuildingCommand(Scanner sc, HashMap<Integer, Building> buildMap, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.caretaker = caretaker;
        af = new CreateApartmentCommandFactory(sc, buildMap, caretaker);
        hf = new CreateHouseCommandFactory(sc, buildMap, caretaker);
    }

    public void execute() {

        System.out.println("Enter Building Type (a=Apartment/h=House):");
        String Userinput = sc.nextLine();

        switch (Userinput) {
            case "a":
                af.createCommand().execute();
                break;

            case "h":
                hf.createCommand().execute();
                break;
        }
    }

    public void undo() {

    }

    public void redo() {

    }

}
