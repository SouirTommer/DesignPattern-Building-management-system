package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class DeleteroomsCommandFactory implements CommandFactory {

    Scanner sc;
    HashMap<Integer, Building> buildMap;
    int buildingNo;

    public DeleteroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;

    }

    public Command createCommand() {
        Command c = new DeleteroomsCommand(sc, buildMap, buildingNo);
        return c;
    }
}