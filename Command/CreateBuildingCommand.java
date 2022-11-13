package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Command command;
    Stack commands;
<<<<<<< HEAD
    Caretaker caretaker;

    public CreateBuildingCommand(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.caretaker = caretaker;
=======
    CommandFactory af;
    CommandFactory hf;

    public CreateBuildingCommand(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        af = new CreateApartmentCommandFactory(sc, buildMap, commands);
        hf = new CreateHouseCommandFactory(sc, buildMap, commands);
>>>>>>> 1b209cbe7108b28c5f6fe306eadcb987a07c3982
    }

    public void execute() {

        System.out.println("Enter Building Type (a=Apartment/h=House):");
        String Userinput = sc.nextLine();

        switch (Userinput) {
            case "a":
<<<<<<< HEAD
                command = new CreateApartmentCommandFactory(sc, buildMap, commands, caretaker).createCommand();
                command.execute();
                break;

            case "h":
                command = new CreateHouseCommandFactory(sc, buildMap, commands, caretaker).createCommand();
                command.execute();
=======
                af.createCommand().execute();
                break;

            case "h":
                hf.createCommand().execute();
>>>>>>> 1b209cbe7108b28c5f6fe306eadcb987a07c3982
                break;
        }
    }

    public void undo() {

    }

    public void redo() {

    }

}
