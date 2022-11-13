package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyBuildingCommandFactory implements CommandFactory {
    Stack commands;
    HashMap<Integer, Building> buildMap;
    Scanner sc;
    Caretaker caretaker;

    public ModifyBuildingCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.caretaker = caretaker;
    }

    public Command createCommand() {
        Command c = new ModifyBuildingCommand(sc, buildMap, caretaker);
        commands.push(c);
        return c;

    }
}
