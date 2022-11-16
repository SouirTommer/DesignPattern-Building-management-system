/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Memento;

import Building.*;
import java.util.*;

public class BuildingMemento implements Memento {

    private Building building;
    private int buildNo;

    // house
    private int noOfFloors;

    // apartment
    private String supportStaff;
    private double monthlyRental;
    private boolean IsCreate;

    //
    private ArrayList<Room> mroomList;
    private ArrayList<Room> mroomListClone;

    public BuildingMemento(Building building, int buildNo, boolean IsCreate) {
        this.buildNo = buildNo;
        this.building = building;
        this.IsCreate = IsCreate;

        if (this.building instanceof House) {
            this.noOfFloors = ((House) this.building).getFloors();
        } else if (this.building instanceof Apartment) {
            this.supportStaff = ((Apartment) this.building).getSupportStaff();
            this.monthlyRental = ((Apartment) this.building).getMonthlyRental();
        }

        this.mroomListClone = (ArrayList) building.getRooms().clone();
        this.mroomList = building.getRooms();

    }

    // save the state
    public void restore() {

        if (building instanceof House) {
            ((House) building).setFloors(noOfFloors);
        } else if (building instanceof Apartment) {
            ((Apartment) building).setSupportStaff(supportStaff);
            ((Apartment) building).setMonthlyRental(monthlyRental);
        }
        mroomList.clear();
        mroomList.addAll(this.mroomListClone);
    }

    public Building getmbuilding() {
        return building;
    }

    public int getmbuildingNo() {
        return buildNo;
    }

    public boolean getIsCreate() {
        return IsCreate;
    }
}