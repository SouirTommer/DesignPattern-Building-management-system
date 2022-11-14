package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class DeleteroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;
    Caretaker ct;
    int roomNo;
    private Building building;
    private Room room;

    public DeleteroomsCommand(int roomNo ,Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo, Caretaker ct) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.roomNo = roomNo;
        this.ct = ct;
        building = buildMap.get(buildingNo);
        room = building.getRooms().get(roomNo - 1);
    }

    public void execute() {
        ct.saveRoom(room, room.getWidth(), room.getWidth(), buildMap.get(buildingNo), buildingNo, this.toString(),
                false);

        System.out.println("Updated Building:");
        buildMap.get(buildingNo).deleteRoom(roomNo);
        buildMap.get(buildingNo).printBuilding();

        sc.nextLine();

    };

    public String toString() {

        return "Delete Room : Building No. " + buildingNo + " ,Room No. " + roomNo + ", Length : "
                + buildMap.get(buildingNo).getRooms().get(roomNo-1).getLength() + ", Width : " + buildMap.get(buildingNo).getRooms().get(roomNo-1).getWidth();
    }

    public void undo() {

    };

    public void redo() {

    };
}
