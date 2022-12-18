/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class DeleteroomsCommand implements Command {
    
    private HashMap<Integer, Building> buildingList;
    private Scanner sc;
    private int buildNo;
    private Caretaker ct;
    private int roomNo;

    private Building building;

    public DeleteroomsCommand(int roomNo, HashMap<Integer, Building> buildingList, int buildNo, Scanner sc, Caretaker ct) {
        this.roomNo = roomNo;
        this.buildingList = buildingList;
        this.buildNo = buildNo;
        this.sc = sc;
        this.ct = ct;
        building = buildingList.get(buildNo);
    }

    public void execute() {

        ct.saveBuidling(building, buildNo, toString(), false);

        System.out.println("Updated Building:");
        buildingList.get(buildNo).deleteRoom(roomNo);
        buildingList.get(buildNo).printBuilding();
        
        sc.nextLine();

    };   
    public String toString() {
        return "Delete Room : Building No. " + buildNo + " ,Room No. " + roomNo + ", Length : "+ buildingList.get(buildNo).getRooms().get(roomNo-1).getLength() + ", Width : " + buildingList.get(buildNo).getRooms().get(roomNo-1).getWidth();
    }
}
