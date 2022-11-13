package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class ModifyroomsCommandFactory implements CommandFactory {

    Scanner sc;
    HashMap<Integer, Building> buildMap;
    int buildingNo;

    public ModifyroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap,int buildingNo) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;

    }

    public Command createCommand() {
        Command c = new ModifyroomsCommand(sc, buildMap, buildingNo);
        return c;
    }
}