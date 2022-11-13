package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class DeleteroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;
    Caretaker caretaker;

    public DeleteroomsCommand(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.caretaker = caretaker;
    }

    public void execute() {

        // caretaker.saveBuidling(buildMap.get(buildingNo), buildingNo,
        // this.toString());

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
