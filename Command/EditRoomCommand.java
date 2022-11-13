package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class EditRoomCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Stack commands;
<<<<<<< HEAD
    Caretaker caretaker;

    public EditRoomCommand(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.caretaker = caretaker;
=======
    int buildingNo;
    CommandFactory acf;
    CommandFactory dcf;
    CommandFactory mcf;

    public EditRoomCommand(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, int buildingNo) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.buildingNo = buildingNo;
        acf = new AddroomsCommandFactory(sc, buildMap, commands, buildingNo);
        dcf = new DeleteroomsCommandFactory(sc, buildMap, commands, buildingNo);
        mcf = new ModifyroomsCommandFactory(sc, buildMap, commands, buildingNo);
>>>>>>> 1b209cbe7108b28c5f6fe306eadcb987a07c3982
    }

    public void execute() {
        buildMap.get(buildingNo).printBuilding();
        System.out.println("");
        System.out.println("Please enter command: [a|d|m]");
        System.out.println("a = add room, d = delete room, m = modify room");
        String Userinput = sc.next();
        sc.nextLine();

        Command c = null;

        switch (Userinput) {
            case "a":
<<<<<<< HEAD
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
=======
                acf.createCommand().execute();
                break;
            case "d":
                dcf.createCommand().execute();
                break;

            case "m":
                mcf.createCommand().execute();
>>>>>>> 1b209cbe7108b28c5f6fe306eadcb987a07c3982
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
