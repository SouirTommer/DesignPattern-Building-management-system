package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class DeleteroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;
    Caretaker ct;
    public DeleteroomsCommand(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo,Caretaker ct) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.ct = ct;
    }

    public void execute() {

        ct.saveBuidling(buildMap.get(buildingNo), buildingNo,this.toString(),false);

        System.out.print("Room No.: ");
        int roomNo = sc.nextInt();

        System.out.println("Updated Building:");
        buildMap.get(buildingNo).deleteRoom(roomNo);
        buildMap.get(buildingNo).printBuilding();
        
        sc.nextLine();

    };

    public void undo() {

    };

    public void redo() {

    };
}
