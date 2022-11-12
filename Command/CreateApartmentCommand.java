package Command;

import Building.*;
import Memento.*;
import java.util.*;

public class CreateApartmentCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;

    public CreateApartmentCommand(Scanner sc, HashMap<Integer, Building> buildMap) {
        this.sc = sc;
        this.buildMap = buildMap;
    }

    public void execute() {
        BuildingFactory bf = new ApartmentFactory();
        Building apartment = bf.createBuilding(sc);
        buildMap.put(apartment.getId(), apartment);
    };

    public void undo() {

    };

    public void redo() {

    };
}
