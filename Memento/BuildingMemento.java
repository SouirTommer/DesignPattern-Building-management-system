package Memento;

import Building.*;
import java.util.*;
public class BuildingMemento  implements MementoIF{
    private Building mbuilding;
    private int mbuildingNo;
    // common
    // house
    private int mnoOfFloors;
    // apartment
    private String msupportStaff;
    private double mmonthlyRental;
    private ArrayList<Room> mroomList;
    private ArrayList<Room> mroomListClone;
    private boolean IsCreate;

    public BuildingMemento(Building building, int buildingNo, boolean IsCreate) {
        this.mbuildingNo = buildingNo;
        mbuilding = building;
        this.IsCreate = IsCreate;
        this.mroomListClone =(ArrayList)mbuilding.getRooms().clone();
        this.mroomList =mbuilding.getRooms();
        System.out.println(mroomList);

        if (mbuilding instanceof House) {
            this.mnoOfFloors = ((House) mbuilding).getFloors();
        } else if (mbuilding instanceof Apartment) {
            this.msupportStaff = ((Apartment) mbuilding).getSupportStaff();
            this.mmonthlyRental = ((Apartment) mbuilding).getMonthlyRental();
        }

    }

    // restore the product
    public void restore() {

        mroomList.clear();
        mroomList.addAll(this.mroomListClone);

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

    public boolean getIsCreate() {
        return this.IsCreate;
    }
}