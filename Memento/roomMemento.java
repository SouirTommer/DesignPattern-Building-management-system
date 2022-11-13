package Memento;

import Building.*;
import java.util.*;

public class roomMemento implements MementoIF {
    private Room mroom;
    private double mlength;
    private double mwidth;
    private boolean IsCreate;

    public roomMemento(Room room, boolean IsCreate) {
        mroom = room;
        this.IsCreate = IsCreate;
        mlength = mroom.getLength();
        mwidth = mroom.getWidth();

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