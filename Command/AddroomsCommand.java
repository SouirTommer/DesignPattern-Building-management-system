/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Command;

import Building.*;
import Memento.*;
import java.util.*;

public class AddroomsCommand implements Command {
    private double roomLength;
    private double roomWidth;
    private HashMap<Integer, Building> buildingList;
    private int buildNo;
    private Scanner sc;
    private Caretaker ct;
    private Building building;

    //local
    private int roomNo;

    public AddroomsCommand(double roomLength, double roomWidth, HashMap<Integer, Building> buildingList, int buildNo, Scanner sc, Caretaker ct) {
        this.buildingList = buildingList;
        this.buildNo = buildNo;
        this.sc = sc;
        this.ct = ct;
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
        building = buildingList.get(buildNo);
    }

    public void execute() {

        sc.nextLine();
        roomNo = buildingList.get(buildNo).getRoomQty() + 1;
        ct.saveBuidling(building, buildNo, toString(), false);

        System.out.println("Updated Building:");
        buildingList.get(buildNo).addRoom(roomLength, roomWidth);
        buildingList.get(buildNo).printBuilding();
        

    };

    public String toString(){
        return "Add Room : Building No. " + buildNo + " ,Room No. " + roomNo + ", Length : " + roomLength + ", Width : " + roomWidth;
    }
}
