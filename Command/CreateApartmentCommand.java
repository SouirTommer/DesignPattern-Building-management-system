package Command;

import Building.*;
import java.util.*;

public class CreateApartmentCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Building apartment;

    public CreateApartmentCommand(Scanner sc, HashMap<Integer, Building> buildMap) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.apartment = null;
    }

    public void execute() {
        BuildingFactory bf = new ApartmentFactory();
        apartment = bf.createBuilding(sc);
        buildMap.put(apartment.getId(), apartment);
    };

    public void undo() {
        if (apartment != null) {
            buildMap.remove(apartment.getId(),apartment);
        }
    };

    public void redo() {
        if (apartment != null) {
            buildMap.put(apartment.getId(), apartment);
        }
    };
}
