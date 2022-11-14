package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class AddroomsCommandFactory implements CommandFactory {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    int buildingNo;
    Caretaker ct;

    public AddroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo,Caretaker ct) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.ct = ct;
    }

    public Command createCommand() {
        Command c = new AddroomsCommand(sc, buildMap, buildingNo, ct);
        return c;
    }


}
