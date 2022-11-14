package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class ModifyroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;
    private int buildingNo;
    private Caretaker ct;
    private Building building;
    private int roomno;
    private Room room;

    public ModifyroomsCommand(int roomno, Scanner sc, HashMap<Integer, Building> buildMap, int buildingNo,
            Caretaker ct) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.buildingNo = buildingNo;
        this.ct = ct;
        this.roomno = roomno;
        building = buildMap.get(buildingNo);
        room = building.getRooms().get(roomno - 1);
    }

    public void execute() {

        ct.saveRoom(room, room.getWidth(), room.getWidth(), buildMap.get(buildingNo), buildingNo, this.toString(),
                true);

        System.out.print("Length: ");
        double roomLength = sc.nextDouble();

        System.out.print("Width: ");
        double roomWidth = sc.nextDouble();
        sc.nextLine();
        System.out.println("Updated Building:");
        buildMap.get(buildingNo).modifyRoom(roomno, roomLength, roomWidth);
        buildMap.get(buildingNo).printBuilding();

        System.out.println("Finish");

        System.out.println(buildMap.get(buildingNo));

    };

    public String toString() {
        return "Modify Room : ";
    }

    public void undo() {

    };

    public void redo() {

    };
}
