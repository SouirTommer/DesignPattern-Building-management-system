package Command;
import java.util.*;
import Building.*;
import Memento.*;

public class CreateBuildingCommandFactory implements CommandFactory{

    Stack commands;
    Scanner sc;
    HashMap<Integer, Building> buildMap;

    public CreateBuildingCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
    }

    @Override
    public Command createCommand() {
        Command c = new CreateBuildingCommand(sc, buildMap,commands);
        return c;
    }
    
}
