package Command;

import java.util.*;
import Building.*;
<<<<<<< HEAD
import Memento.Caretaker;
=======
>>>>>>> cc44774567e21b7c1989585a0651e161d5d9e70f

public class AddroomsCommandFactory implements CommandFactory {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Stack commands;
    int buildingNo;
    Caretaker caretaker;

    public AddroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, int buildingNo,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.buildingNo = buildingNo;
        this.caretaker = caretaker;
    }

    public Command createCommand() {
        Command c = new AddroomsCommand(sc, buildMap, buildingNo, caretaker);
    }

    // public Command createCommand() {
    //     Command c = new AddroomsCommand(sc, buildMap, buildingNo);
    //     commands.push(c);
    //     return c;
    // }
}
