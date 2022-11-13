package Command;

import Building.*;
import java.util.*;
import Memento.*;

public class CreateApartmentCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    Building apartment;
    Caretaker caretaker;

    public CreateApartmentCommand(Scanner sc, HashMap<Integer, Building> buildMap, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.apartment = null;
        this.caretaker = caretaker;
    }

    public void execute() {
        BuildingFactory bf = new ApartmentFactory();
        this.apartment = bf.createBuilding(sc);
        buildMap.put(apartment.getId(), apartment);

        caretaker.saveBuidling(apartment, apartment.getId(), this.toString());
    };

    public void undo() {
        if (apartment != null) {
            buildMap.remove(apartment.getId(), apartment);
        }
    };

    public void redo() {
        if (apartment != null) {
            buildMap.put(apartment.getId(), apartment);
        }
    };

    public String toString() {
        Apartment apt = (Apartment) buildMap.get(apartment.getId());
        return "Add Building : Building No.:" + apt.getId() + " ,Support Staff:" + apt.getSupportStaff()
                + ", Monthly Rental:" + apt.getMonthlyRental();

    public Building getApartment() {
        return apartment;
    }
}
