package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class AddroomsCommandFactory implements CommandFactory {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Stack commands;
    int buildingNo;
    Caretaker caretaker;

    public AddroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, int buildingNo) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.buildingNo = buildingNo;
        this.caretaker = caretaker;
    }

    public Command createCommand() {
        Command c = new AddroomsCommand(sc, buildMap, buildingNo, caretaker);
        commands.push(c);
        return c;
    }

    // public Command createCommand() {
    // Command c = new AddroomsCommand(sc, buildMap, buildingNo);
    // commands.push(c);
    // return c;
    // }
}
