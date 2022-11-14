package Command;

import java.util.*;
import Building.*;
import Memento.Caretaker;

public class ModifyroomsCommandFactory implements CommandFactory {

    Scanner sc;
    HashMap<Integer, Building> buildMap;
    int buildingNo;
    Caretaker ct;

    public ModifyroomsCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap,int buildingNo,Caretaker ct) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.ct = ct;
    }

    public Command createCommand() {
        System.out.print("Room No.: ");
        int roomNo = sc.nextInt();
        Command c = new ModifyroomsCommand(roomNo,sc, buildMap, buildingNo,ct);
        return c;
    }
}