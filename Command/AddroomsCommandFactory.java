package Command;

import java.util.*;
import Building.*;

public class AddroomsCommandFactory implements CommandFactory {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Stack commands;
    int buildingNo;

    public AddroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands, int buildingNo) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
        this.buildingNo = buildingNo;
    }

    public Command createCommand() {
        Command c = new AddroomsCommand(sc, buildMap, buildingNo);
        commands.push(c);
        return c;
    }
}
