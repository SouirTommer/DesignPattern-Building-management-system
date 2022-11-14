package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class AddroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;
    Caretaker ct;
    int roomNo;
    double roomLength;
    double roomWidth;
    Building building;
    Room room;

    public AddroomsCommand(double roomLength, double roomWidth, Scanner sc, HashMap<Integer, Building> buildMap,
            int buildingNo, Caretaker ct) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.ct = ct;
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
        building = buildMap.get(buildingNo);
    }


    public void execute() {

        roomNo = buildMap.get(buildingNo).getRoomQty() + 1;
        ct.saveRoom(room, roomWidth, roomLength, buildMap.get(buildingNo), buildingNo, this.toString(),
                false);

        System.out.println("Updated Building:");
        buildMap.get(buildingNo).addRoom(roomLength, roomWidth);
        buildMap.get(buildingNo).printBuilding();

        sc.nextLine();

    };

    public String toString() {
        return "Add Room : Building No. " + buildingNo + " ,Room No. " + (roomNo) + ", Length : " + roomLength
                + ", Width : " + roomWidth;
    }

    public void undo() {

    };

    public void redo() {

    };
}
