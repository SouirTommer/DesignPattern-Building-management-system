package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class AddroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;

    public AddroomsCommand(Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
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
    };

    public void undo() {

    };

    public void redo() {

    };
}
