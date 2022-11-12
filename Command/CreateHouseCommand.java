package Command;

import Building.*;
import Memento.*;
import java.util.*;

public class CreateHouseCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Building house;

    public CreateHouseCommand(Scanner sc, HashMap<Integer, Building> buildMap) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.house = null;
    }

    public void execute() {
        BuildingFactory bf = new HouseFactory();
        house = bf.createBuilding(sc);
        buildMap.put(house.getId(), house);
    };

    public void undo() {
        if (house != null) {
            buildMap.remove(house.getId(),house);
        }
    };

    public void redo() {
        if (house != null) {
            buildMap.put(house.getId(),house);
        }
    };
}

