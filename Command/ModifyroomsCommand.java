package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;
    Caretaker caretaker;

    public ModifyroomsCommand(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo, Caretaker caretaker) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.caretaker = caretaker;
    }

    public void execute() {

        // caretaker.saveBuidling(buildMap.get(buildingNo), buildingNo,
        // this.toString(),true);

        System.out.print("Room No.: ");
        int roomNo = sc.nextInt();

        System.out.print("Length: ");
        double roomLength = sc.nextDouble();

        System.out.print("Width: ");
        double roomWidth = sc.nextDouble();

        System.out.println("Updated Building:");
        buildMap.get(buildingNo).modifyRoom(roomNo, roomLength, roomWidth);
        buildMap.get(buildingNo).printBuilding();

        System.out.println("Finsih");

        System.out.println("m test");

        System.out.println(buildMap.get(buildingNo) + " " + buildingNo);

    };

    public void undo() {

    };

    public void redo() {

    };
}
