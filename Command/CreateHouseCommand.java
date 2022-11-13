package Command;

import Building.*;
import Memento.*;
import java.util.*;

public class CreateHouseCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Building house;
    Caretaker caretaker;

    public CreateHouseCommand(Scanner sc, HashMap<Integer, Building> buildMap, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.house = null;
        this.caretaker = caretaker;
    }

    public void execute() {
        BuildingFactory bf = new HouseFactory();
        house = bf.createBuilding(sc);
        buildMap.put(house.getId(), house);
        caretaker.clearRedoList();
        caretaker.saveBuidling(house, house.getId(), this.toString(), true);

    };

    public void undo() {

    };

    public void redo() {

    };

    public Building getHouse() {
        return house;
    }

    public String toString() {
        House hus = (House) buildMap.get(house.getId());
        return "Add Building : Building No.:" + hus.getId() + " ,No. of Floor:" + hus.getFloors();
    }
}
