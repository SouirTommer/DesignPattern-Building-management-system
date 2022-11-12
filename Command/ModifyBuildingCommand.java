package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyBuildingCommand implements Command {
    HashMap<Integer, Building> buildMap;
    Scanner sc;

    public ModifyBuildingCommand(Scanner sc, HashMap<Integer, Building> buildMap) {
        this.sc = sc;
        this.buildMap = buildMap;
    }

    public void execute() {
        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();
        buildMap.get(buildingNo).toString();
        buildMap.get(buildingNo).modifyBuilding(sc);
        
    }

    public void undo() {

    }

    public void redo() {

    }
}
