/*
Last Edit  13/11/2022
*/
package Memento;

import Building.*;

public class ModifyRoomMemento implements Memento {

    //room content
    private Room room;
    private double Width;
    private double Length;

    public ModifyRoomMemento(Room room) {
        this.room = room;
        this.Width = room.getWidth();
        this.Length = room.getLength();
    }
    
    public void restore() {
        room.setLength(Length);
        room.setWidth(Width);

    }

    public Room getRoom() {
        return room;
    }
}