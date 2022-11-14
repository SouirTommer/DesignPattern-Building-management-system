package Memento;

import Building.*;
import java.util.*;

public class RoomMemento implements MementoIF {
    private Building mbuilding;
    private int mbuildingNo;
    private boolean IsMod;
    private ArrayList<Room> mroomList;
    private ArrayList<Room> mroomListClone;
    private Room mroom;
    private double mWidth;
    private double mLength;

    public RoomMemento(Room mroom, double mWidth, double mLength, Building building, int buildingNo, Boolean IsMod) {
        this.mroom = mroom;
        this.mWidth = mWidth;
        this.mLength = mLength;
        this.mbuildingNo = buildingNo;
        mbuilding = building;
        this.IsMod = IsMod;
        this.mroomListClone = (ArrayList) mbuilding.getRooms().clone();
        this.mroomList = mbuilding.getRooms();

    }
    // public Roomemento(Room mroom,Building building, int buildingNo,Boolean
    // IsCreate){
    // this.mbuildingNo = buildingNo;
    // mbuilding = building;
    // this.IsCreate = IsCreate;
    // this.mroom = mroom;
    // }

    // restore the product
    public void restore() {
        if (IsMod) {
            mroom.setLength(mLength);
            mroom.setWidth(mWidth);
        } else {
            mroomList.clear();
            mroomList.addAll(this.mroomListClone);
        }

    }

    public Room getRoom() {
        return this.mroom;
    }

    public double getWidth() {
        return this.mWidth;
    }

    public double getLength() {
        return this.mLength;
    }

    public Building getmbuilding() {
        return this.mbuilding;
    }

    public int getmbuildingNo() {
        return this.mbuildingNo;
    }

    public boolean getIsMod() {
        return this.IsMod;
    }
}