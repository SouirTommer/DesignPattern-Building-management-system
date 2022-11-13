package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class AddroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;
    Caretaker caretaker;

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

        sc.nextLine();

        caretaker.saveBuidling(buildMap.get(buildingNo), buildMap.get(buildingNo).getId(), this.toString());
    };

    public void undo() {

    };

    public void redo() {

    };
}
