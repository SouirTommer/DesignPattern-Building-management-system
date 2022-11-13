package Memento;

import Building.*;
import java.util.*;

public class Memento {
    private Building mbuilding;
    private int mbuildingNo;
    // common
    private ArrayList<Room> mrooms;
    // house
    private int mnoOfFloors;
    // apartment
    private String msupportStaff;
    private double mmonthlyRental;

    public Memento(Building building, int buildingNo) {
        this.mbuildingNo = buildingNo;
        this.mbuilding = building;
        this.mrooms = mbuilding.getRooms();

        if (mbuilding instanceof House) {
            this.mnoOfFloors = ((House) mbuilding).getFloors();
        } else if (mbuilding instanceof Apartment) {
            this.msupportStaff = ((Apartment) mbuilding).getSupportStaff();
            this.mmonthlyRental = ((Apartment) mbuilding).getMonthlyRental();
        }

    }

    // restore the product
    public void restore() {
        int round = mbuilding.getRoomQty();
        for (int i = 0; i < round; i++) {
            mbuilding.addRoom(this.mrooms.get(i).getLength(), this.mrooms.get(i).getWidth());
        }
        // Printing and display the elements in ArrayList

        if (mbuilding instanceof House) {
            ((House) mbuilding).setFloors(this.mnoOfFloors);
        } else if (mbuilding instanceof Apartment) {
            ((Apartment) mbuilding).setSupportStaff(this.msupportStaff);
            ((Apartment) mbuilding).setMonthlyRental(this.mmonthlyRental);
        }
    }

    // get product
    public Building getmbuilding() {
        return this.mbuilding;
    }

    public int getmbuildingNo() {
        return this.mbuildingNo;
    }
}