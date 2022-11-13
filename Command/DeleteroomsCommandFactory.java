package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class DeleteroomsCommandFactory implements CommandFactory {

    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Stack commands;
    int buildingNo;
    Caretaker caretaker;

    public DeleteroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, int buildingNo,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.buildingNo = buildingNo;
        this.caretaker = caretaker;
    }

    public Command createCommand() {
        Command c = new DeleteroomsCommand(sc, buildMap, buildingNo, caretaker);
        commands.push(c);
        return c;
    }
}