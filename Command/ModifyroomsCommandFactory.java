package Command;

import java.util.*;
import Building.*;

public class ModifyroomsCommandFactory implements CommandFactory {

    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Stack commands;
    int buildingNo;

    public ModifyroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, int buildingNo) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.buildingNo = buildingNo;
    }

    public Command createCommand() {
        Command c = new ModifyroomsCommand(sc, buildMap, buildingNo);
        commands.push(c);
        return c;
    }
}