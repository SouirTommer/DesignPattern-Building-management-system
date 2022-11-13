package Command;

import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommandFactory implements CommandFactory {

    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Caretaker caretaker;

    public CreateBuildingCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap,
            Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.caretaker = caretaker;
    }

    @Override
    public Command createCommand() {
        Command c = new CreateBuildingCommand(sc, buildMap,caretaker);
        return c;
    }

}
