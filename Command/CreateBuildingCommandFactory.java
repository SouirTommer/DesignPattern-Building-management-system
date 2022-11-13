package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommandFactory implements CommandFactory {

    Stack commands;
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Caretaker caretaker;

    public CreateBuildingCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
        Command c = new CreateBuildingCommand(sc, buildMap, commands, caretaker);
        return c;
    }

}
