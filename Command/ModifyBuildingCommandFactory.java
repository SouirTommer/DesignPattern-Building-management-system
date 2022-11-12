package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyBuildingCommandFactory implements CommandFactory {
    Stack commands;
    HashMap<Integer, Building> buildMap;
    Scanner sc;

    public ModifyBuildingCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
    }

    public Command createCommand() {
        Command c = new ModifyBuildingCommand(sc, buildMap);
        commands.push(c);
        return c;
        
    }
}
