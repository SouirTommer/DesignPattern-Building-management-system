package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class AddroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;
    Caretaker caretaker;
    int Roomindex;

    public AddroomsCommand(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.caretaker = caretaker;
    }

    public void execute() {
        System.out.print("Length: ");
        double roomLength = sc.nextDouble();

        System.out.print("Width: ");
        double roomWidth = sc.nextDouble();
        System.out.println("Updated Building:");
        buildMap.get(buildingNo).addRoom(roomLength, roomWidth);
        buildMap.get(buildingNo).printBuilding();
        Roomindex = buildMap.size()-1;
        caretaker.saveRoom(buildMap.get(buildingNo).getRooms().get(Roomindex), toString(), true);
        sc.nextLine();

    };

    public String toString(){
        Room room = (Room) buildMap.get(buildingNo).getRooms().get(Roomindex);
        return "Add Room : Building No. " + buildingNo + " ,Room No. "+(Roomindex+1) + ", Length : "+ room.getLength()+", Width : "+room.getWidth();
    }

    public void undo() {

    };

    public void redo() {

    };
}
