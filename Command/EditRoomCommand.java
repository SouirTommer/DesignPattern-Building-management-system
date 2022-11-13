package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class EditRoomCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Stack commands;
    Caretaker caretaker;

    public EditRoomCommand(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.caretaker = caretaker;
    }

    public void execute() {

        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();
        buildMap.get(buildingNo).printBuilding();

        System.out.println("");
        System.out.println("Please enter command: [a|d|m]");
        System.out.println("a = add room, d = delete room, m = modify room");
        String Userinput = sc.next();
        sc.nextLine();

        Command c = null;

        switch (Userinput) {
            case "a":
                c = new AddroomsCommandFactory(sc, buildMap, commands, buildingNo, caretaker).createCommand();
                c.execute();
                break;
            case "d":
                c = new DeleteroomsCommandFactory(sc, buildMap, commands, buildingNo, caretaker).createCommand();
                c.execute();
                break;

            case "m":
                c = new ModifyroomsCommandFactory(sc, buildMap, commands, buildingNo, caretaker).createCommand();
                c.execute();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public void undo() {

    }

    public void redo() {

    }

}
