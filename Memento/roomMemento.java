package Memento;

import Building.*;
import java.util.*;

public class RoomMemento implements MementoIF{
    private Room mroom;
    private double mlength;
    private double mwidth;
    private boolean IsCreate;
    private int mroomNo;
    ArrayList<String> mroomlist;

    public RoomMemento(Room room, boolean IsCreate) {
        this.mroom = room;
        this.IsCreate = IsCreate;
        this.mlength = mroom.getLength();
        this.mwidth = mroom.getWidth();

    }

    // restore the product
    public void restore() {
        mroom.setLength(this.mlength);
        mroom.setWidth(this.mwidth);
    }

    // get product
    public Room getmRoom() {
        return this.mroom;
    }

    public boolean getIsCreate() {
        return IsCreate;
    }
}