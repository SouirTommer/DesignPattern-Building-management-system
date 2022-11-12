package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateHouseCommandFactory implements CommandFactory {
    Stack commands;
    Scanner sc;
    HashMap<Integer, Building> buildMap;

    public CreateHouseCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
    }

    @Override
    public Command createCommand() {
        Command c = new CreateHouseCommand(sc, buildMap);
        commands.push(c);
        return c;
    }
}
