package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyBuildingCommandFactory implements CommandFactory {
    HashMap<Integer, Building> buildMap;
    Scanner sc;
    Caretaker caretaker;

    public ModifyBuildingCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.caretaker = caretaker;
    }

    public Command createCommand() {
        Command c = new ModifyBuildingCommand(sc, buildMap, caretaker);
        return c;

    }
}
