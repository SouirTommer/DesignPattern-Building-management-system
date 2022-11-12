package Command;

import Building.*;
import Memento.*;
import java.util.*;

public class CreateHouseCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;

    public CreateHouseCommand(Scanner sc, HashMap<Integer, Building> buildMap) {
        this.sc = sc;
        this.buildMap = buildMap;
    }

    public void execute() {
        BuildingFactory bf = new HouseFactory();
        Building house = bf.createBuilding(sc);
        buildMap.put(house.getId(), house);
    };

    public void undo() {

    };

    public void redo() {

    };
}

