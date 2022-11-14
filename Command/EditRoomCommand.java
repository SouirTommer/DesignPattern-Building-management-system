package Command;

import java.util.*;

import javax.swing.text.Caret;

import Building.*;
import Memento.Caretaker;

public class EditRoomCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    int buildingNo;
    CommandFactory acf;
    CommandFactory dcf;
    CommandFactory mcf;

    public EditRoomCommand(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo,Caretaker ct) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        acf = new AddroomsCommandFactory(sc, buildMap, buildingNo,ct);
        dcf = new DeleteroomsCommandFactory(sc, buildMap, buildingNo,ct);
        mcf = new ModifyroomsCommandFactory(sc, buildMap, buildingNo,ct);
    }

    public void execute() {
        buildMap.get(buildingNo).printBuilding();
        System.out.println("");
        System.out.println("Please enter command: [a|d|m]");
        System.out.println("a = add room, d = delete room, m = modify room");
        String Userinput = sc.next();
        sc.nextLine();

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
