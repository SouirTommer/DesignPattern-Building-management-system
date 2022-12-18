/*
Last Edit  15/11/2022
*/
package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyroomsCommand implements Command {
    private HashMap<Integer, Building> buildingList;
    private int buildNo;
    private Caretaker ct;
    private int roomNo;
    private double roomLength;
    private double roomWidth;
    private Room room;
    private Scanner sc;
    private Building building;

    public ModifyroomsCommand(HashMap<Integer, Building> buildingList, int buildNo, int roomNo, Scanner sc, Caretaker ct) {
        this.buildingList = buildingList;
        this.buildNo = buildNo;
        this.roomNo = roomNo;
        this.ct = ct;
        this.sc = sc;
        building = buildingList.get(buildNo);
        room = building.getRooms().get(roomNo);
    }

    public void execute() {

        System.out.print("Room No.: ");
        roomNo = sc.nextInt();

        System.out.print("Length: ");
        roomLength = sc.nextDouble();

        System.out.print("Width: ");
        roomWidth = sc.nextDouble();
        sc.nextLine();

        ct.saveRoom(room, toString());

        System.out.println("Updated Building:");
        buildingList.get(buildNo).modifyRoom(roomNo, roomLength, roomWidth);
        buildingList.get(buildNo).printBuilding();
        

    }
    public String toString(){
        return "Modify Room : Building No. " + buildNo + " ,Room No. " + roomNo + ", Length : "+ roomLength + ", Width : " + roomWidth;
    }
}