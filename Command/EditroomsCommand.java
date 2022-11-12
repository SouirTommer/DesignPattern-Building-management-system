package Command;

import Building.*;
import Memento.*;

import java.util.*;

public class EditroomsCommand implements Command {
    Scanner sc;
    HashMap<Integer, Building> buildMap;

    public EditroomsCommand(Scanner sc, HashMap<Integer, Building> buildMap) {
        this.sc = sc;
        this.buildMap = buildMap;
    }

    public void execute() {
        System.out.print("Building No.: ");
        int buildingNo = sc.nextInt();
        buildMap.get(buildingNo).printBuilding();

        System.out.println("");
        System.out.println("Please enter command: [a|d|m]");
        System.out.println("a = add room, d = delete room, m = modify room");
        sc.nextLine();
        String Userinput = sc.nextLine();

        if (Userinput.equals("a")) {

            System.out.print("Length: ");
            double roomLength = sc.nextDouble();

            System.out.print("Width: ");
            double roomWidth = sc.nextDouble();
            System.out.println("Updated Building:");
            buildMap.get(buildingNo).addRoom(roomLength, roomWidth);
            buildMap.get(buildingNo).printBuilding();
        }

        if (Userinput.equals("d")) {

            System.out.print("Room No.: ");
            int roomNo = sc.nextInt();

            System.out.println("Updated Building:");
            buildMap.get(buildingNo).deleteRoom(roomNo);
            buildMap.get(buildingNo).printBuilding();
        }
        if (Userinput.equals("m")) {

            System.out.print("Room No.: ");
            int roomNo = sc.nextInt();

            System.out.print("Length: ");
            double roomLength = sc.nextDouble();

            System.out.print("Width: ");
            double roomWidth = sc.nextDouble();

            System.out.println("Updated Building:");
            buildMap.get(buildingNo).modifyRoom(roomNo, roomLength, roomWidth);
            buildMap.get(buildingNo).printBuilding();

        }
        sc.nextLine();
    };

    public void undo() {

    };

    public void redo() {

    };
}
