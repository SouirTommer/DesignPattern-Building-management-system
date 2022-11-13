package Command;

import java.util.*;
import Building.*;

public class EditRoomCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Stack commands;
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
                acf.createCommand().execute();
                break;
            case "d":
                dcf.createCommand().execute();
                break;

            case "m":
                mcf.createCommand().execute();
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
