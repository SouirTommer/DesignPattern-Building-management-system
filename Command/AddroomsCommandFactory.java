package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class AddroomsCommandFactory implements CommandFactory {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    int buildingNo;
    Caretaker caretaker;

    public AddroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.caretaker = caretaker;
    }

    public Command createCommand() {
        Command c = new AddroomsCommand(sc, buildMap, buildingNo, caretaker);
        return c;
    }

    // public Command createCommand() {
    // Command c = new AddroomsCommand(sc, buildMap, buildingNo);
    // commands.push(c);
    // return c;
    // }
}
